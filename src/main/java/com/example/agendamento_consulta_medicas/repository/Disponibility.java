package com.example.agendamento_consulta_medicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Disponibility extends JpaRepository<Disponibility, Long> {
    
}
