package br.com.fatecmaua.matematicaAPI.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecmaua.matematicaAPI.model.Resposta;
import br.com.fatecmaua.matematicaAPI.repository.RespostaRepository;
import br.com.fatecmaua.matematicaAPI.service.RespostaService;

@RestController
@RequestMapping(value = "/resposta")
public class RespostaController {

	@Autowired
	private RespostaRepository respostaRepository;
	
	@Autowired
    private RespostaService respostaService;
	
	// Endpoint para responder a uma questão
	 @PostMapping("/responder")
	    public ResponseEntity<String> responderQuestao(
	        @RequestParam(value = "idAluno") Long idAluno,
	        @RequestParam(value = "idQuestao") Long idQuestao,
	        @RequestParam(value = "alternativaEscolhida") String alternativaEscolhida
	    ) {
		 
		 if (respostaRepository.findByAlunoIdAndQuestaoId(idAluno, idQuestao).isPresent()) {
		        throw new IllegalArgumentException("Esse aluno já respondeu essa questão.");
		    }
		 
	        respostaService.processarResposta(idAluno, idQuestao, alternativaEscolhida);
	        return ResponseEntity.ok("Resposta registrada e desempenho atualizado.");
	    }

	// Criar uma nova resposta
	@PostMapping
	public ResponseEntity<Resposta> criarResposta(@RequestBody Resposta resposta) {
		try {
			Resposta novaResposta = respostaRepository.save(resposta);
			return new ResponseEntity<>(novaResposta, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar todas as respostas
	@GetMapping
	public ResponseEntity<List<Resposta>> listarRespostas() {
		try {
			List<Resposta> respostas = respostaRepository.findAll();
			if (respostas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(respostas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar uma resposta por ID
	@GetMapping("/{id}")
	public ResponseEntity<Resposta> buscarRespostaPorId(@PathVariable("id") Long id) {
		Optional<Resposta> resposta = respostaRepository.findById(id);
		return resposta.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// Atualizar uma resposta
	@PutMapping("/{id}")
	public ResponseEntity<Resposta> atualizarResposta(@PathVariable("id") Long id, @RequestBody Resposta resposta) {
		Optional<Resposta> respostaExistente = respostaRepository.findById(id);
		if (respostaExistente.isPresent()) {
			Resposta respostaAtualizada = respostaExistente.get();
			respostaAtualizada.setQuestao(resposta.getQuestao());
			respostaAtualizada.setAlternativa_escolhida(resposta.getAlternativa_escolhida());
			respostaAtualizada.setAcertou(resposta.isAcertou());
			return new ResponseEntity<>(respostaRepository.save(respostaAtualizada), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Deletar uma resposta
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deletarResposta(@PathVariable("id") Long id) {
		try {
			if (respostaRepository.existsById(id)) {
				respostaRepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
