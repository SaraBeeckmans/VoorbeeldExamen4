package com.example.voorbeeldexamen4;

public class Pokemon {
    public String getName(String pokemonName) {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getImageName() {
        return imageName;
    }

    public String setImageName(String imageName) {
        this.imageName = imageName;
        return imageName;
    }

    private String name;
    private String imageName;
}
