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

import br.com.fatecmaua.matematicaAPI.model.Turma;
import br.com.fatecmaua.matematicaAPI.repository.TurmaRepository;

@RestController
@RequestMapping(value = "/turma")
public class TurmaController {

	@Autowired
	private TurmaRepository turmaRepository;

	// Criar uma nova turma
	@PostMapping
	public ResponseEntity<Turma> criarTurma(@RequestBody Turma turma) {
		try {
			Turma novaTurma = turmaRepository.save(turma);
			return new ResponseEntity<>(novaTurma, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar todas as turmas
	@GetMapping
	public ResponseEntity<List<Turma>> listarTurmas() {
		try {
			List<Turma> turmas = turmaRepository.findAll();
			if (turmas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(turmas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar uma turma por ID
	@GetMapping("/{id}")
	public ResponseEntity<Turma> buscarTurmaPorId(@PathVariable("id") Long id) {
		Optional<Turma> turma = turmaRepository.findById(id);
		return turma.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// Atualizar uma turma
	@PutMapping("/{id}")
	public ResponseEntity<Turma> atualizarTurma(@PathVariable("id") Long id, @RequestBody Turma turma) {
		Optional<Turma> turmaExistente = turmaRepository.findById(id);
		if (turmaExistente.isPresent()) {
			Turma turmaAtualizada = turmaExistente.get();
			turmaAtualizada.setProfessor(turma.getProfessor());
			turmaAtualizada.setCodigo(turma.getCodigo());
			turmaAtualizada.setAno_escolar(turma.getAno_escolar());
			return new ResponseEntity<>(turmaRepository.save(turmaAtualizada), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Deletar uma turma
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deletarTurma(@PathVariable("id") Long id) {
		try {
			if (turmaRepository.existsById(id)) {
				turmaRepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
