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

import br.com.fatecmaua.matematicaAPI.model.Habilidade;
import br.com.fatecmaua.matematicaAPI.repository.HabilidadeRepository;

@RestController
@RequestMapping(value = "/habilidade")
public class HabilidadeController {

	@Autowired
	private HabilidadeRepository habilidadeRepository;

	// Criar uma nova habilidade
	@PostMapping
	public ResponseEntity<Habilidade> criarAtividade(@RequestBody Habilidade habilidade) {
		try {
			Habilidade novaHabilidade = habilidadeRepository.save(habilidade);
			return new ResponseEntity<>(novaHabilidade, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Listar todas as habilidades
	@GetMapping
	public ResponseEntity<List<Habilidade>> listarHabilidades() {
		try {
			List<Habilidade> habilidades = habilidadeRepository.findAll();
			if (habilidades.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(habilidades, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar uma habilidade por ID
	@GetMapping("/{id}")
	public ResponseEntity<Habilidade> buscarHabilidadePorId(@PathVariable("id") Long id) {
		Optional<Habilidade> atividade = habilidadeRepository.findById(id);
		return atividade.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// Atualizar uma habilidade
	@PutMapping("/{id}")
	public ResponseEntity<Habilidade> atualizarAtividade(@PathVariable("id") Long id,
			@RequestBody Habilidade habilidade) {
		Optional<Habilidade> habilidadeExistente = habilidadeRepository.findById(id);
		if (habilidadeExistente.isPresent()) {
			Habilidade habilidadeAtualizada = habilidadeExistente.get();
			habilidadeAtualizada.setAnoEscolar(habilidade.getAnoEscolar());
			habilidadeAtualizada.setBimestre(habilidade.getBimestre());
			habilidadeAtualizada.setSigla(habilidade.getSigla());
			habilidadeAtualizada.setObjetoConhecimento(habilidade.getObjetoConhecimento());
			habilidadeAtualizada.setDescricao(habilidade.getDescricao());
			habilidadeAtualizada.setUnidade(habilidade.getUnidade());
			return new ResponseEntity<>(habilidadeRepository.save(habilidadeAtualizada), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Deletar uma atividade
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deletarAtividade(@PathVariable("id") Long id) {
		try {
			if (habilidadeRepository.existsById(id)) {
				habilidadeRepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
