package com.example.android.funbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityKelas10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas10);
    }

    public void protista (View view){
        Intent intent = new Intent(ActivityKelas10.this,IsiMateri.class);
        intent.putExtra("pengertian",getString(R.string.textProtista_pngertian));
        intent.putExtra("klasifikasi",getString(R.string.textProtista_klasifikasi));
        intent.putExtra("ciri2",getString(R.string.textProtista_ciri2));
        intent.putExtra("imagess", R.drawable.protista);
        startActivity(intent);
    }

    public void virus (View view){
        Intent intent = new Intent(ActivityKelas10.this,IsiMateri.class);
        intent.putExtra("pengertian",getString(R.string.textVirus_pengertian));
        intent.putExtra("klasifikasi",getString(R.string.textVirus_ciri2));
        intent.putExtra("ciri2",getString(R.string.textVirus_ciri2));
        intent.putExtra("imagess", R.drawable.virus);
        startActivity(intent);
    }

}
