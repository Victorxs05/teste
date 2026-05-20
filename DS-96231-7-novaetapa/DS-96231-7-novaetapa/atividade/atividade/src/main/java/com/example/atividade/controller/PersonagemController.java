package com.example.atividade.controller;

import com.example.atividade.dto.PersonagemRequestDTO;
import com.example.atividade.dto.PersonagemResponseDTO;
import com.example.atividade.service.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
    @Autowired
    private PersonagemService service;

    @GetMapping
    public ResponseEntity<List<PersonagemResponseDTO>> listar() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody PersonagemRequestDTO dto) {
        service.salvarPersonagem(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Personagem cadastrado com sucesso"));
    }
}
