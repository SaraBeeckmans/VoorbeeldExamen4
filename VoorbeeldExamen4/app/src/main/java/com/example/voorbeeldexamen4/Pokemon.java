package com.example.voorbeeldexamen4;

public class Pokemon {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Pokemon(String name, String imageName){
        this.name = name;
        this.imageName = imageName;
    }
    private String name;
    private String imageName;
}
