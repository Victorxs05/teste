package com.example.atividade.repository;

import com.example.atividade.model.PersonagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemModel, Long> {
    Optional<PersonagemModel> findByFamilia(String familia);
}
