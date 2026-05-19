package com.trabalho.barbershop.dto;
import java.io.Serial;
import java.io.Serializable;
import com.trabalho.barbershop.models.Barbeiro;

public class BarbeiroResponseDTO implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;              // identificador único do barbeiro
    private String nome;            // nome do barbeiro
    private String telefone;        // telefone de contato
    private String email;           // email de contato

    public BarbeiroResponseDTO() {
    }

    public BarbeiroResponseDTO(Barbeiro barbeiro) {
        id = barbeiro.getId();
        nome = barbeiro.getNome();
        telefone = barbeiro.getTelefone();
        email = barbeiro.getEmail();
    }

    public static long getSerialversionuid() {
        return serialVersionUID;  
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
