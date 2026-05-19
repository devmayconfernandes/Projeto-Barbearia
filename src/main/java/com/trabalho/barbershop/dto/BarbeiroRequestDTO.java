package com.trabalho.barbershop.dto;


public class BarbeiroRequestDTO {
    
    private String nome;            // nome do barbeiro
    private String telefone;        // telefone de contato
    private String email;           // email de contato

    public BarbeiroRequestDTO() {
    }

    public BarbeiroRequestDTO(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
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
