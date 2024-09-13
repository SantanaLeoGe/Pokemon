package com.example.pokemon.dto;

import java.util.List;

public class PokemonDto {

    private String name;
    private List<TypeDto> types; // Tipos de Pokémon

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TypeDto> getTypes() {
        return types;
    }

    public void setTypes(List<TypeDto> types) {
        this.types = types;
    }

    public static class TypeDto {
        private TypeDataDto type;

        public TypeDataDto getType() {
            return type;
        }

        public void setType(TypeDataDto type) {
            this.type = type;
        }
    }

    public static class TypeDataDto {
        private String name; // Nombre del tipo (e.g., fuego, agua)

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
