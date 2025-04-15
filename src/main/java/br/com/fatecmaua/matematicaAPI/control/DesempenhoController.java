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

import br.com.fatecmaua.matematicaAPI.model.Desempenho;
import br.com.fatecmaua.matematicaAPI.repository.DesempenhoRepository;

@RestController
@RequestMapping(value = "/desempenho")
public class DesempenhoController {

	@Autowired
	private DesempenhoRepository desempenhoRepository;

	// Criar um novo desempenho
	@PostMapping
	public ResponseEntity<Desempenho> criarDesempenho(@RequestBody Desempenho desempenho) {
		try {
			Desempenho novoDesempenho = desempenhoRepository.save(desempenho);
			return new ResponseEntity<>(novoDesempenho, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Listar todos os desempenhos
	@GetMapping
	public ResponseEntity<List<Desempenho>> listarDesempenhos() {
		try {
			List<Desempenho> desempenhos = desempenhoRepository.findAll();
			if (desempenhos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(desempenhos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar um desempenho por ID
	@GetMapping("/{id}")
	public ResponseEntity<Desempenho> buscarDesempenhoPorId(@PathVariable("id") Long id) {
		Optional<Desempenho> desempenho = desempenhoRepository.findById(id);
		return desempenho.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// Atualizar um desempenho
	@PutMapping("/{id}")
	public ResponseEntity<Desempenho> atualizarDesempenho(@PathVariable("id") Long id,
			@RequestBody Desempenho desempenho) {
		Optional<Desempenho> desempenhoExistente = desempenhoRepository.findById(id);
		if (desempenhoExistente.isPresent()) {
			Desempenho desempenhoAtualizado = desempenhoExistente.get();
			desempenhoAtualizado.setAluno(desempenho.getAluno());
			desempenhoAtualizado.setTurma(desempenho.getTurma());
			desempenhoAtualizado.setPontuacao_final(desempenho.getPontuacao_final());
			desempenhoAtualizado.setAtividades_concluidas(desempenho.getAtividades_concluidas());
			desempenhoAtualizado.setSugestao(desempenho.getSugestao());
			return new ResponseEntity<>(desempenhoRepository.save(desempenhoAtualizado), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Deletar um desempenho
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deletarDesempenho(@PathVariable("id") Long id) {
		try {
			if (desempenhoRepository.existsById(id)) {
				desempenhoRepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
