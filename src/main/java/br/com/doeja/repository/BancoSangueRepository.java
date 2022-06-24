package br.com.doeja.repository;

import br.com.doeja.modelo.BancoSangue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoSangueRepository extends JpaRepository<BancoSangue, Long> {
}
