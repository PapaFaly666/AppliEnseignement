package com.example.microgestenseignants.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("PER")
@Entity
public class Per extends Enseignant{
    private String matricule;
}
