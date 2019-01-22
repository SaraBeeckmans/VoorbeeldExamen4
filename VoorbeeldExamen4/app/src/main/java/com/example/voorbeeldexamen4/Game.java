package com.example.voorbeeldexamen4;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private char[][] gameMatrix = new char[3][3];
    private int streak = 0;
    public int n =0;
    private int highscore=0;


    public static ArrayList<Pokemon> pokemonlist =  new ArrayList<Pokemon>();

    public  void createPokemons(){

        pokemonlist.add(new Pokemon("name1", "button_00"));
        pokemonlist.add(new Pokemon("name2", "button_01"));
        pokemonlist.add(new Pokemon("name3", "button_02"));
        pokemonlist.add(new Pokemon("name4", "button_10"));
        pokemonlist.add(new Pokemon("name5", "button_11"));
        pokemonlist.add(new Pokemon("name6", "button_12"));
        pokemonlist.add(new Pokemon("name7", "button_20"));
        pokemonlist.add(new Pokemon("name8", "button_21"));
        pokemonlist.add(new Pokemon("name9", "button_22"));

    }


    public String getXO(int x, int y){
        return String.valueOf(gameMatrix[x][y]);
    }

    public String RandomNamePicker(){
        Random rand = new Random();

        n = rand.nextInt(8);

        return pokemonlist.get(n).getName();

    }

    public Integer CheckStreak(int x, int y, String selectedPokemon){
        String buttonClicked = "button_"+Integer.toString(x)+Integer.toString(y);

        if(buttonClicked.equals(pokemonlist.get(n).getImageName()))
            streak++;
        else
            streak=0;



        return streak;
    }

    public Integer CheckHighscore(){
        if(highscore<streak)
            highscore=streak;

        return highscore;
    }


    public void CountHitsAndMisses(int x, int y){
        String buttonClicked = "button_"+Integer.toString(x)+Integer.toString(y);
        int hit = pokemonlist.get(n).getHit();
        int mis = pokemonlist.get(n).getMis();
        if(buttonClicked.equals(pokemonlist.get(n).getImageName()))
        {
            hit++;
            pokemonlist.get(n).setMis(hit);
        }
        else
        {
            mis++;
            pokemonlist.get(n).setMis(mis);
        }
    }



}
