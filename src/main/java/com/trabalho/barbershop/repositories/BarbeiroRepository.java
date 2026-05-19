package com.trabalho.barbershop.repositories;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.trabalho.barbershop.models.Barbeiro;

public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {
    Optional<Barbeiro> findByTelefone(String telefone);

}
