package com.example.agendamento_consulta_medicas.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_PATIENTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    
    @Id
    private Long userId;

    @Column(nullable = false, unique = true)
    private String cpf;
    
    @Column(nullable = false, unique = true)
    private String telephone;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<Consultation> consultations;
}
