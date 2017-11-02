package com.example.android.funbio;

/**
 * Created by nadyaaditama on 10/27/17.
 */



public class Jawaban {
    private String jawaban;
    private QuizClass soalQuiz;
    private int skor = 0;

    public Jawaban(String jawaban, QuizClass soalQuiz) {
        this.jawaban = jawaban;
        this.soalQuiz = soalQuiz;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public QuizClass getSoalQuiz() {
        return soalQuiz;
    }

    public void setSoalQuiz(QuizClass soalQuiz) {
        this.soalQuiz = soalQuiz;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public void periksaJawaban(){
        if (jawaban.equals(this.soalQuiz.getKunci())) {
            skor = skor + 25;
        }
    }
}