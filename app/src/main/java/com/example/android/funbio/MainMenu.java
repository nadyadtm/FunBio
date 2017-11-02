package com.example.android.funbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void viewMateri(View view){
        Intent intent = new Intent(MainMenu.this,MateriMenu.class);
        startActivity(intent);
    }

    public void viewKuis(View view){
        Intent intent = new Intent(MainMenu.this,QuizActivity.class);
        startActivity(intent);
        finish();
    }
}
