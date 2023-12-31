package com.example.microgestenseignants.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Enseignement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private String objectifs;
    private String description;
    private Instant dateCreation;

    @OneToMany(mappedBy = "enseignement")
    private List<Repartition> enseignants;
}
