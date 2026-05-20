package com.example.atividade.service;

import com.example.atividade.dto.PersonagemRequestDTO;
import com.example.atividade.dto.PersonagemResponseDTO;
import com.example.atividade.model.PersonagemModel;
import com.example.atividade.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {
    @Autowired
    private PersonagemRepository repository;

    public List<PersonagemResponseDTO> listarTodos() {
        return repository
                .findAll()
                .stream()
                .map(p -> new PersonagemResponseDTO(
                        p.getNome(),
                        p.getFamilia(),
                        p.getHabilidade()
                ))
                .toList();
    }

    public PersonagemModel salvarPersonagem(PersonagemRequestDTO dto) {
        if (repository.findByFamilia(dto.getFamilia()).isPresent()) {
            throw new RuntimeException("Personagem já cadastrado.");
        }

        PersonagemModel novoPersonagem = new PersonagemModel();
        novoPersonagem.setNome(dto.getNome());
        novoPersonagem.setFamilia(dto.getFamilia());
        novoPersonagem.setHabilidade(dto.getHabilidade());
        novoPersonagem.setFraqueza(dto.getFraqueza());
        return repository.save(novoPersonagem);
    }
}
