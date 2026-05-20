package com.example.atividade.repository;

import com.example.atividade.model.CenarioModel;
import com.example.atividade.model.PersonagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CenarioRepository extends JpaRepository<CenarioModel, Long> {
    Optional<CenarioModel> findByEpoca(String epoca);

}
