package com.example.voorbeeldexamen4;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private char[][] gameMatrix = new char[3][3];
//    private Pokemon pokemon = new Pokemon();
//    String [] pokemonNames = new String[9];
//    String [] pokemonPics = new String[9];

        ArrayList<Pokemon> pokemonlist =  new ArrayList<Pokemon>();

    public void createPokemons(){

        pokemonlist.add(new Pokemon("name1", "button_00"));
        pokemonlist.add(new Pokemon("name2", "button_00"));
        pokemonlist.add(new Pokemon("name3", "button_00"));
        pokemonlist.add(new Pokemon("name4", "button_00"));
        pokemonlist.add(new Pokemon("name5", "button_00"));
        pokemonlist.add(new Pokemon("name6", "button_00"));
        pokemonlist.add(new Pokemon("name7", "button_00"));
        pokemonlist.add(new Pokemon("name8", "button_00"));
        pokemonlist.add(new Pokemon("name9", "button_00"));

    }



    public String getXO(int x, int y){
        return String.valueOf(gameMatrix[x][y]);
    }

    public String RandomNamePicker(){
        Random rand = new Random();

        int n = rand.nextInt(8);

        return pokemonlist.get(n).getName();

    }




}
