package br.com.fatecmaua.matematicaAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecmaua.matematicaAPI.model.Desempenho;
import br.com.fatecmaua.matematicaAPI.model.Turma;
import br.com.fatecmaua.matematicaAPI.model.Usuario;
import br.com.fatecmaua.matematicaAPI.repository.DesempenhoRepository;
import br.com.fatecmaua.matematicaAPI.repository.TurmaRepository;
import br.com.fatecmaua.matematicaAPI.repository.QuestaoRepository;
import br.com.fatecmaua.matematicaAPI.repository.UsuarioRepository;


@Service
public class DesempenhoService {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private DesempenhoRepository desempenhoRepository;

	@Autowired
	private TurmaRepository turmaRepository;

	@Autowired
	private QuestaoRepository questaoRepository;

	public void atualizarDesempenho(Long idAluno, Long idQuestao, boolean acertou) {
		// Buscando a turma do aluno com base no idAluno
		Turma turma = turmaRepository.findAll().stream()
				.filter(t -> t.getAlunos().stream().anyMatch(aluno -> aluno.getId().equals(idAluno))).findFirst()
				.orElseThrow(() -> new RuntimeException("Aluno não encontrado na turma"));
		
		Usuario aluno = turma.getAlunos().stream()
			    .filter(a -> a.getId().equals(idAluno))
			    .findFirst()
			    .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

		// Buscando o desempenho do aluno na turma específica
		Optional<Desempenho> desempenhoOptional = desempenhoRepository.findByAlunoIdAndTurmaId(idAluno, turma.getId());

		Desempenho desempenho;
		if (desempenhoOptional.isPresent()) {
			desempenho = desempenhoOptional.get();
		} else {
			// Se o desempenho não existir, criamos um novo
			desempenho = new Desempenho(0, 0.0, aluno, turma, "");
		}

		// Atualizando as atividades e pontuação
		int novasAtividades = desempenho.getAtividades_concluidas() + 1;
		double novaPontuacao = desempenho.getPontuacao_final() + (acertou ? 1.0 : 0.0);

		double media = novaPontuacao / novasAtividades;
		media = Math.max(0.0, Math.min(1.0, media));
		String sugestao = gerarSugestao(media*10);

		desempenho.setMedia(media*10);
		desempenho.setAtividades_concluidas(novasAtividades);
		desempenho.setPontuacao_final(novaPontuacao);
		desempenho.setSugestao(sugestao);
		desempenhoRepository.save(desempenho);
	}

	private String gerarSugestao(double media) {
		if (media >= 9)
			return "Excelente desempenho";
		if (media >= 7)
			return "Bom desempenho, continuar revisando";
		if (media >= 5)
			return "Atenção em pontos específicos";
		return "Reforço necessário";
	}
}
