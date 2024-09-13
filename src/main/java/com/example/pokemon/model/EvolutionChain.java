package com.example.pokemon.model;


import jakarta.persistence.*;

@Entity
public class EvolutionChain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String evolutionStage;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getevolution() {
        return evolutionStage;
    }

    public void setevolution(String evolutionStage) {
        this.evolutionStage = evolutionStage;
    }
}
