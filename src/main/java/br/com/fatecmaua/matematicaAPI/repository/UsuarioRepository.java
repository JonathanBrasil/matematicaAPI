package br.com.fatecmaua.matematicaAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecmaua.matematicaAPI.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
