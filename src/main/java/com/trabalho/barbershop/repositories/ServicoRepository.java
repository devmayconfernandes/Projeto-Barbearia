package com.trabalho.barbershop.repositories;
import com.trabalho.barbershop.models.Servico;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServicoRepository extends JpaRepository<Servico, Long> {
    Optional<Servico> findByNome(String nome);
}
