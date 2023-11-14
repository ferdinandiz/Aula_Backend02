package com.example.aula_backend02.repository;

import com.example.aula_backend02.model.Tipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TiposRepository extends JpaRepository<Tipos,Long> {
    @Override
    Optional<Tipos> findById(Long id);
}
