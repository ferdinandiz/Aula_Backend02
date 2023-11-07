package com.example.aula_backend02.repository;

import com.example.aula_backend02.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
    @Override
    Optional<Pessoa> findById(Long id);
}
