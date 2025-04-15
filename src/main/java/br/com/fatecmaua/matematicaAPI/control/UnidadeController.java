package br.com.fatecmaua.matematicaAPI.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecmaua.matematicaAPI.model.Unidade;
import br.com.fatecmaua.matematicaAPI.repository.UnidadeRepository;


@RestController
@RequestMapping(value = "/unidade")
public class UnidadeController {

	@Autowired
	private UnidadeRepository unidadeRepository;

	// Listar todas as Unidades
	@GetMapping
	public ResponseEntity<List<Unidade>> listarConteudos() {
		try {
			List<Unidade> conteudos = unidadeRepository.findAll();
			if (conteudos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(conteudos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Buscar um conteúdo por ID
	@GetMapping("/{id}")
	public ResponseEntity<Unidade> buscarConteudoPorId(@PathVariable("id") Long id) {
		Optional<Unidade> conteudo = unidadeRepository.findById(id);
		return conteudo.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// Atualizar um conteúdo
	@PutMapping("/{id}")
	public ResponseEntity<Unidade> atualizarConteudo(@PathVariable("id") Long id, @RequestBody Unidade unidade) {
		Optional<Unidade> unidadeExistente = unidadeRepository.findById(id);
		if (unidadeExistente.isPresent()) {
			Unidade unidadeAtualizado = unidadeExistente.get();
			unidadeAtualizado.setNome(unidade.getNome());
			unidadeAtualizado.setDescricao(unidade.getDescricao());
			return new ResponseEntity<>(unidadeRepository.save(unidadeAtualizado), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Deletar um conteúdo
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deletarUnidade(@PathVariable("id") Long id) {
		try {
			if (unidadeRepository.existsById(id)) {
				unidadeRepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
