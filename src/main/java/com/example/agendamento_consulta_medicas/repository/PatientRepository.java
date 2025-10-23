package com.example.agendamento_consulta_medicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agendamento_consulta_medicas.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}
