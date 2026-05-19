package com.trabalho.barbershop.services;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.trabalho.barbershop.dto.BarbeiroRequestDTO;
import com.trabalho.barbershop.dto.BarbeiroResponseDTO;
import com.trabalho.barbershop.models.Barbeiro;
import com.trabalho.barbershop.repositories.BarbeiroRepository;
import com.trabalho.barbershop.services.exceptions.DatabaseException;

import jakarta.transaction.Transactional;

@Service
public class BarbeiroService {

    private final BarbeiroRepository barbeiroRepository;

    public BarbeiroService(BarbeiroRepository barbeiroRepository) {
        this.barbeiroRepository = barbeiroRepository;
    }

    @Transactional
    public BarbeiroResponseDTO salvar(BarbeiroRequestDTO dto) {                         
        if (barbeiroRepository.findByTelefone(dto.getTelefone()).isPresent()) {             
            throw new DatabaseException("Já existe um barbeiro com esse telefone.");   
        }

        Barbeiro barbeiro = new Barbeiro();
        barbeiro.setNome(dto.getNome());
        barbeiro.setTelefone(dto.getTelefone());
        barbeiro.setEmail(dto.getEmail());
        Barbeiro salvo = barbeiroRepository.save(barbeiro);
        return new BarbeiroResponseDTO(salvo);
    }

    public BarbeiroResponseDTO buscarPorId(Long id) {
            Barbeiro barbeiro = barbeiroRepository.findById(id)
                    .orElseThrow(() -> new DatabaseException("Barbeiro não encontrado com id: " + id));

            return new BarbeiroResponseDTO(barbeiro);
    }

    public List<BarbeiroResponseDTO> listarTodos() {
        List<Barbeiro> list = barbeiroRepository.findAll();
        return list.stream().map(BarbeiroResponseDTO::new).collect(Collectors.toList());
    }

    public void deletar(Long id) {
        buscarPorId(id);

        barbeiroRepository.deleteById(id);
    }

    public BarbeiroResponseDTO atualizar(Long id, BarbeiroRequestDTO dto) {
        Barbeiro barbeiro = barbeiroRepository.findById(id)
                .orElseThrow(() -> new DatabaseException("Barbeiro não encontrado com id: " + id));

        if (!barbeiro.getTelefone().equals(dto.getTelefone()) && barbeiroRepository.findByTelefone(dto.getTelefone()).isPresent()) { 
            throw new DatabaseException("Já existe um barbeiro com esse telefone.");
        }

        barbeiro.setNome(dto.getNome());
        barbeiro.setTelefone(dto.getTelefone());
        barbeiro.setEmail(dto.getEmail());
        Barbeiro atualizado = barbeiroRepository.save(barbeiro);
        return new BarbeiroResponseDTO(atualizado);
    }
}
