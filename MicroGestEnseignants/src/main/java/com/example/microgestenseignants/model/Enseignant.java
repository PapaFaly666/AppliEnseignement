package com.example.microgestenseignants.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorColumn(name = "type",length = 3)
@Entity
public abstract class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String prenom;
    private String nom;
    private String grade;

    @OneToMany(mappedBy = "enseignant")
    private List<Repartition> enseignements;

}
