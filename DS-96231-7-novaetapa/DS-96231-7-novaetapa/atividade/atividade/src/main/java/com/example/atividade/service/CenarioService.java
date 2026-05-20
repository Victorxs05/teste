package com.example.atividade.service;

import com.example.atividade.dto.CenarioRequestDTO;
import com.example.atividade.dto.CenarioRespondeDTO;
import com.example.atividade.model.CenarioModel;
import com.example.atividade.repository.CenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenarioService {
    @Autowired
    private CenarioRepository repository;

    public List<CenarioRespondeDTO> listarTodos() {
        return repository
                .findAll()
                .stream()
                .map(c -> new CenarioRespondeDTO(
                        c.getLocal(),
                        c.getLocal(),
                        c.getPerigos()
                ))
                .toList();
    }

    public CenarioModel salvarCenario(CenarioRequestDTO dto) {
        if (repository.findByEpoca(dto.getEpoca()).isPresent()) {
            throw new RuntimeException("Cenário já cadastrado");
        }
        CenarioModel novoCenario = new CenarioModel();
        novoCenario.setLocal(dto.getLocal());
        novoCenario.setEpoca(dto);
    }
}
