package com.trabalho.barbershop.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.trabalho.barbershop.dto.ServicoRequestDTO;
import com.trabalho.barbershop.dto.ServicoResponseDTO;
import com.trabalho.barbershop.services.ServicoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService service;

    public ServicoController(ServicoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ServicoResponseDTO> salvarServico(@RequestBody @Valid ServicoRequestDTO dto) {
        ServicoResponseDTO dtoSalvar = service.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dtoSalvar);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ServicoResponseDTO> buscarPorId(@PathVariable Long id) {
        ServicoResponseDTO obj = service.buscarPorId(id);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarServicoPorId(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ServicoResponseDTO>> listarTodos() {
        List<ServicoResponseDTO> listDto = service.listarTodos();
        return ResponseEntity.ok(listDto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ServicoResponseDTO> atualizarServico(@PathVariable Long id, @RequestBody @Valid ServicoRequestDTO dto) {
        ServicoResponseDTO dtoAtualizado = service.atualizar(id, dto);
        return ResponseEntity.ok(dtoAtualizado);

    }



}