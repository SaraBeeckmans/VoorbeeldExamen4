package com.example.voorbeeldexamen4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Bundle b = getIntent().getExtras();
        int highscore = b.getInt("highscore");

        TextView txtHighScore = (TextView) findViewById(R.id.txtHighscoreNext);
        txtHighScore.setText(Integer.toString(highscore));
    }
}
