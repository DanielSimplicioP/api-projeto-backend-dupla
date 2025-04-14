package com.universidade.gerenciamentopessoas.repository;

import com.universidade.gerenciamentopessoas.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
