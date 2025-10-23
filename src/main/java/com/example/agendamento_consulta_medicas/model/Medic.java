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
@Table(name = "TB_MEDICS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medic {
    
    @Id
    private Long userId;

    @Column(unique = true, nullable = false)
    private String crm;

    @Column(nullable = false)
    private String speciality;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

    @OneToMany(mappedBy = "medic", cascade = CascadeType.ALL)
    private Set<Disponibility> disponibilities;

    @OneToMany(mappedBy = "medic", cascade = CascadeType.ALL)
    private Set<Consultation> consultations;

}
