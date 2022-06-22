package br.com.doeja.repository;

import java.util.Optional;

import br.com.doeja.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email);
	Optional<Usuario> findByCpf(String cpf);

}