package br.com.fatecmaua.matematicaAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecmaua.matematicaAPI.model.Questao;
import br.com.fatecmaua.matematicaAPI.model.Resposta;
import br.com.fatecmaua.matematicaAPI.model.Usuario;
import br.com.fatecmaua.matematicaAPI.repository.QuestaoRepository;
import br.com.fatecmaua.matematicaAPI.repository.RespostaRepository;
import br.com.fatecmaua.matematicaAPI.repository.UsuarioRepository;


@Service
public class RespostaService {
	@Autowired
    private RespostaRepository respostaRepository;

    @Autowired
    private QuestaoRepository questaoRepository;

    @Autowired
    private DesempenhoService desempenhoService;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void processarResposta(Long idAluno, Long idQuestao, String alternativaEscolhida) {
        // Verificar se a questão existe
        Questao questao = questaoRepository.findById(idQuestao)
                .orElseThrow(() -> new RuntimeException("Questão não encontrada"));

        // Verificar se o aluno já respondeu a esta questão
        Resposta resposta = respostaRepository.findByAlunoIdAndQuestaoId(idAluno, questao.getId())
                .orElseGet(() -> new Resposta());

        // Verificar se a alternativa está correta
        boolean acertou = questao.getResposta_correta().equals(alternativaEscolhida);

        // Atualizar ou criar a resposta
        Usuario aluno = usuarioRepository.findById(idAluno)
        	    .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        resposta.setAluno(aluno);
        resposta.setAlternativa_escolhida(alternativaEscolhida);
        resposta.setAcertou(acertou);
        resposta.setQuestao(questao);

        respostaRepository.save(resposta);

        // Atualizar o desempenho do aluno
        desempenhoService.atualizarDesempenho(idAluno, idQuestao, acertou);
    }
	
}
