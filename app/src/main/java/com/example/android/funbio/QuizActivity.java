package com.example.android.funbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    ArrayList<QuizClass> Kump_Kuis= new ArrayList<>();
    TextView no_soal;
    TextView soal;
    TextView pil_a;
    TextView pil_b;
    TextView pil_c;
    TextView pil_d;
    Button next;
    int indeks = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        no_soal = (TextView) findViewById(R.id.no_soal);
        soal = (TextView) findViewById(R.id.soal);
        pil_a = (TextView) findViewById(R.id.pil_a);
        pil_b = (TextView) findViewById(R.id.pil_b);
        pil_c = (TextView) findViewById(R.id.pil_c);
        pil_d = (TextView) findViewById(R.id.pil_d);
        next = (Button) findViewById(R.id.next);

        QuizClass kuis1 = new QuizClass("1","Yang termasuk ciri-ciri protista adalah","uniseluler", "multiseluler", "eukariotik", "prokariotik","eukariotik");
        QuizClass kuis2 = new QuizClass("2","Sebutan lain dari flagellum atau flagella adalah","Rambut cambuk", "Serabut Bulu", "Serat Bulu", "Bulu Cambuk","Bulu Cambuk");
        QuizClass kuis3 = new QuizClass("3","Virus memiliki sifat sebagai benda mati yaitu….","dapat dikristalkan","terdiri atas ADN atau ARN saja","dapat hidup dalam medium agar-agar","hanya dapat hidup pada sel hidup","dapat dikristalkan");
        QuizClass kuis4 = new QuizClass("4","Selubung protein penyusun virus disebut","virion","kapsid","ADN","Membran","kapsid");

        Kump_Kuis.add(kuis1);
        Kump_Kuis.add(kuis2);
        Kump_Kuis.add(kuis3);
        Kump_Kuis.add(kuis4);

        no_soal.setText(Kump_Kuis.get(indeks).getNo());
        soal.setText(Kump_Kuis.get(indeks).getSoal());
        pil_a.setText(Kump_Kuis.get(indeks).getJwbn_A());
        pil_b.setText(Kump_Kuis.get(indeks).getJwbn_B());
        pil_c.setText(Kump_Kuis.get(indeks).getJwbn_C());
        pil_d.setText(Kump_Kuis.get(indeks).getJwbn_D());

    }

    public void next(View view) {
        if (indeks < Kump_Kuis.size()-1) {
            RadioButton jawabana = (RadioButton) findViewById(R.id.pil_a);
            RadioButton jawabanb = (RadioButton) findViewById(R.id.pil_b);
            RadioButton jawabanc = (RadioButton) findViewById(R.id.pil_c);
            RadioButton jawaband = (RadioButton) findViewById(R.id.pil_d);
            if (jawabana.isChecked()) {
                String jwb_a = jawabana.getText().toString();
                Jawaban jwb = new Jawaban(jwb_a, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            } if (jawabanb.isChecked()) {
                String jwb_b = jawabanb.getText().toString();
                Jawaban jwb = new Jawaban(jwb_b, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            } if (jawabanc.isChecked()) {
                String jwb_c = jawabanc.getText().toString();
                Jawaban jwb = new Jawaban(jwb_c, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            } if (jawaband.isChecked()) {
                String jwb_d = jawaband.getText().toString();
                Jawaban jwb = new Jawaban(jwb_d, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            }
            indeks++;
            no_soal.setText(Kump_Kuis.get(indeks).getNo());
            soal.setText(Kump_Kuis.get(indeks).getSoal());
            pil_a.setText(Kump_Kuis.get(indeks).getJwbn_A());
            pil_b.setText(Kump_Kuis.get(indeks).getJwbn_B());
            pil_c.setText(Kump_Kuis.get(indeks).getJwbn_C());
            pil_d.setText(Kump_Kuis.get(indeks).getJwbn_D());
            if(indeks == Kump_Kuis.size()-1){
                next.setText("Finish");
            }
            String scr = Integer.toString(score);
            Log.v("tag",scr);
            jawabana.setChecked(false);
            jawabanb.setChecked(false);
            jawabanc.setChecked(false);
            jawaband.setChecked(false);

        }
        else if (indeks == Kump_Kuis.size()-1){
            RadioButton jawabana = (RadioButton) findViewById(R.id.pil_a);
            RadioButton jawabanb = (RadioButton) findViewById(R.id.pil_b);
            RadioButton jawabanc = (RadioButton) findViewById(R.id.pil_c);
            RadioButton jawaband = (RadioButton) findViewById(R.id.pil_d);
            if (jawabana.isChecked()) {
                String jwb_a = jawabana.getText().toString();
                Jawaban jwb = new Jawaban(jwb_a, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            } if (jawabanb.isChecked()) {
                String jwb_b = jawabanb.getText().toString();
                Jawaban jwb = new Jawaban(jwb_b, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            } if (jawabanc.isChecked()) {
                String jwb_c = jawabanc.getText().toString();
                Jawaban jwb = new Jawaban(jwb_c, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            } if (jawaband.isChecked()) {
                String jwb_d = jawaband.getText().toString();
                Jawaban jwb = new Jawaban(jwb_d, Kump_Kuis.get(indeks));
                jwb.periksaJawaban();
                score = score + jwb.getSkor();
            }
            String scr = Integer.toString(score);
            Log.v("score ",scr);
            Intent intent = new Intent(QuizActivity.this,Score.class);
            intent.putExtra("score",score);
            startActivity(intent);
            finish();
        }
    }

}

