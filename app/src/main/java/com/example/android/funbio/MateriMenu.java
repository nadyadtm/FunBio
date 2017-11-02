package com.example.android.funbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MateriMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_menu);
    }

    public void kelas10(View view){
        Intent intent = new Intent(MateriMenu.this,ActivityKelas10.class);
        startActivity(intent);
    }

    public  void kelas11(View view){

    }

    public void kelas12(View view){

    }
}
