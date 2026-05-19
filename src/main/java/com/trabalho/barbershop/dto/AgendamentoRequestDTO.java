package com.trabalho.barbershop.dto;

import java.util.List;

public class AgendamentoRequestDTO {
    public String nomeCliente;         // nome do cliente
    public String telefoneCliente;     // telefone do cliente   
    public String data;                // data do agendamento (formato: "yyyy-MM-dd")
    public String horario;             // horário do agendamento (formato: "HH:mm")
    public Long barbeiroId;            // ID do barbeiro selecionado
    public List<Long> servicosIds;         // IDs dos serviços selecionados

    public AgendamentoRequestDTO() {
    }

    public AgendamentoRequestDTO(String nomeCliente, String telefoneCliente, String data, String horario, Long barbeiroId, List<Long> servicosIds) {
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.data = data;
        this.horario = horario;
        this.barbeiroId = barbeiroId;
        this.servicosIds = servicosIds;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Long getBarbeiroId() {
        return barbeiroId;
    }

    public void setBarbeiroId(Long barbeiroId) {
        this.barbeiroId = barbeiroId;
    }

    public List<Long> getServicosIds() {
        return servicosIds;
    }

    public void setServicosIds(List<Long> servicosIds) {
        this.servicosIds = servicosIds;
    }

    

}
