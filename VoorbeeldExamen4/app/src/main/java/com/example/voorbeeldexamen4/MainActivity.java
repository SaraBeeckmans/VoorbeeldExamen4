package com.example.voorbeeldexamen4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Game game;
    private Button[][] buttons = new Button[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
        game.createPokemons();

        TextView pokemontext = (TextView) findViewById(R.id.txtPokemon);
        pokemontext.setText(game.RandomNamePicker());





        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                String buttonID = "button_"+i+j;
                int resId= getResources().getIdentifier(buttonID,"id",getPackageName());
                buttons[i][j] = findViewById(resId);
                buttons[i][j].setOnClickListener(this);

                buttons[i][j].setTag(""+i+j);
                buttons[i][j].setText(game.getXO(i,j));
            }
        }

    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;

        Log.d("abc", "onClick: " + v.getTag());
        String tag = v.getTag().toString();
        int x = Character.getNumericValue(tag.charAt(0));
        int y = Character.getNumericValue(tag.charAt(1));

        Toast toast = Toast.makeText(getApplicationContext(), "x=" + Integer.toString(x)+ " y="+Integer.toString(y), Toast.LENGTH_SHORT);
        toast.show();
    }
}
