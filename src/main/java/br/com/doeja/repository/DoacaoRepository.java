package br.com.doeja.repository;

import br.com.doeja.modelo.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
    List<Doacao> findByUsuarioId(Long id);
}
