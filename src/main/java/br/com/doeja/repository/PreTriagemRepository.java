package br.com.doeja.repository;

import br.com.doeja.modelo.PreTriagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreTriagemRepository extends JpaRepository<PreTriagem, Long> {


    List<PreTriagem> findByUsuarioId(Long id);
}
