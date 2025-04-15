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
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecmaua.matematicaAPI.model.Questao;
import br.com.fatecmaua.matematicaAPI.repository.QuestaoRepository;

@RestController
@RequestMapping(value = "/questao")
public class QuestaoController {

	@Autowired
	private QuestaoRepository questaoRepository;

	// Criar uma nova questão
	@PostMapping
	public ResponseEntity<Questao> criarQuestao(@RequestBody Questao questao) {
		try {
			Questao novaQuestao = questaoRepository.save(questao);
			return new ResponseEntity<>(novaQuestao, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Listar todas as questões
	@GetMapping
	public ResponseEntity<List<Questao>> listarQuestoes() {
		try {
			List<Questao> questoes = questaoRepository.findAll();
			if (questoes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(questoes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar uma questão por ID
	@GetMapping("/{id}")
	public ResponseEntity<Questao> buscarQuestaoPorId(@PathVariable("id") Long id) {
		Optional<Questao> questao = questaoRepository.findById(id);
		return questao.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// Atualizar uma questão
	@PutMapping("/{id}")
	public ResponseEntity<Questao> atualizarQuestao(@PathVariable("id") Long id, @RequestBody Questao questao) {
		Optional<Questao> questaoExistente = questaoRepository.findById(id);
		if (questaoExistente.isPresent()) {
			Questao questaoAtualizada = questaoExistente.get();
			questaoAtualizada.setAtividade(questao.getAtividade());
			questaoAtualizada.setEnunciado(questao.getEnunciado());
			questaoAtualizada.setAlternativa_a(questao.getAlternativa_a());
			questaoAtualizada.setAlternativa_b(questao.getAlternativa_b());
			questaoAtualizada.setAlternativa_c(questao.getAlternativa_c());
			questaoAtualizada.setAlternativa_d(questao.getAlternativa_d());
			questaoAtualizada.setAlternativa_e(questao.getAlternativa_e());
			questaoAtualizada.setResposta_correta(questao.getResposta_correta());
			return new ResponseEntity<>(questaoRepository.save(questaoAtualizada), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Deletar uma questão
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deletarQuestao(@PathVariable("id") Long id) {
		try {
			if (questaoRepository.existsById(id)) {
				questaoRepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
