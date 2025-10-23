package com.example.agendamento_consulta_medicas.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_DISPONIBILITIES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Disponibility {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long disponibilityId;

    @Column(nullable = false)
    private LocalDateTime initialDateHour;

    @Column(nullable = false)
    private LocalDateTime finalDateHour;
    
    @ManyToOne
    @JoinColumn(name ="medic_id")
    private Medic medic;
    

}
