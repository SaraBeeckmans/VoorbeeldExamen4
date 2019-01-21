package com.example.voorbeeldexamen4;

import java.util.Random;

public class Game {
    private char[][] gameMatrix = new char[3][3];
    private Pokemon pokemon = new Pokemon();
    String [] pokemonNames = new String[9];
    String [] pokemonPics = new String[9];

    public void createPokemons(){

        pokemonNames[0] = pokemon.setName("name1");
        pokemonNames[1] = pokemon.setName("name2");
        pokemonNames[2] = pokemon.setName("name3");
        pokemonNames[3] = pokemon.setName("name4");
        pokemonNames[4] = pokemon.setName("name5");
        pokemonNames[5] = pokemon.setName("name6");
        pokemonNames[6] = pokemon.setName("name7");
        pokemonNames[7] = pokemon.setName("name8");
        pokemonNames[8] = pokemon.setName("name9");


        pokemonPics[0] = pokemon.setImageName("button_00");
        pokemonPics[1] = pokemon.setImageName("button_01");
        pokemonPics[2] = pokemon.setImageName("button_02");
        pokemonPics[3] = pokemon.setImageName("button_10");
        pokemonPics[4] = pokemon.setImageName("button_11");
        pokemonPics[5] = pokemon.setImageName("button_12");
        pokemonPics[6] = pokemon.setImageName("button_20");
        pokemonPics[7] = pokemon.setImageName("button_21");
        pokemonPics[8] = pokemon.setImageName("button_22");
    }



    public String getXO(int x, int y){
        return String.valueOf(gameMatrix[x][y]);
    }

    public String RandomNamePicker(){
        Random rand = new Random();

        int n = rand.nextInt(8);

        String temp = pokemonNames[n];
        return pokemon.getName(pokemonNames[n]);

    }




}
