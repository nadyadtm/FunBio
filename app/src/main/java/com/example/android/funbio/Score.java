package com.example.android.funbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent i = getIntent();
        int score = i.getExtras().getInt("score");
        TextView scoreText = (TextView) findViewById(R.id.scoreTextt);
        String str = Integer.toString(score);
        scoreText.setText(str);
    }

    public void b2menu(View view){
        Intent intent = new Intent(Score.this,MainMenu.class);
        startActivity(intent);
        finish();
    }
}
