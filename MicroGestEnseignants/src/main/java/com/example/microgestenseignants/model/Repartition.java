package com.example.microgestenseignants.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repartition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "enseignement_id")
    private Enseignement enseignement;

    @ManyToOne
    @JoinColumn(name = "enseignant_id")
    private Enseignant enseignant;

}
