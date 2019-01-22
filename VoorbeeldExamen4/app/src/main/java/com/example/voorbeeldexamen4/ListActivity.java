package com.example.voorbeeldexamen4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
ListView SimpleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Bundle b = getIntent().getExtras();
        int highscore = b.getInt("highscore");

        TextView txtHighScore = (TextView) findViewById(R.id.txtHighscoreNext);
        txtHighScore.setText(Integer.toString(highscore));


        SimpleList = (ListView) findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<>();


        for (int i=0; i<9; i++){
            arrayList.add(Game.pokemonlist.get(i).getPokemon(i));
        }



        ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayList);
        SimpleList.setAdapter(adapter);
    }
}
