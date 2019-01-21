package com.example.voorbeeldexamen4;

public class Pokemon {
    public Pokemon(String name, String imageName){
        this.name = name;
        this.imageName = imageName;

    }


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


    private String name;
    private String imageName;

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    private int hit = 0;

    public int getMis() {
        return mis;
    }

    public void setMis(int mis) {
        this.mis = mis;
    }

    private int mis = 0;
}
