package com.example.android.funbio;

/**
 * Created by nadyaaditama on 10/27/17.
 */
public class QuizClass {
    private String no;
    private String soal;
    private String jwbn_A;
    private String jwbn_B;
    private String jwbn_C;
    private String jwbn_D;
    private String kunci;

    public QuizClass(String no, String soal, String jwbn_A, String jwbn_B, String jwbn_C, String jwbn_D, String kunci){
        this.no = no;
        this.soal = soal;
        this.jwbn_A = jwbn_A;
        this.jwbn_B = jwbn_B;
        this.jwbn_C = jwbn_C;
        this.jwbn_D = jwbn_D;
        this.kunci = kunci;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getJwbn_A() {
        return jwbn_A;
    }

    public void setJwbn_A(String jwbn_A) {
        this.jwbn_A = jwbn_A;
    }

    public String getJwbn_B() {
        return jwbn_B;
    }

    public void setJwbn_B(String jwbn_B) {
        this.jwbn_B = jwbn_B;
    }

    public String getJwbn_C() {
        return jwbn_C;
    }

    public void setJwbn_C(String jwbn_C) {
        this.jwbn_C = jwbn_C;
    }

    public String getJwbn_D() {
        return jwbn_D;
    }

    public void setJwbn_D(String jwbn_D) {
        this.jwbn_D = jwbn_D;
    }

    public String getKunci() {
        return kunci;
    }

    public void setKunci(String kunci) {
        this.kunci = kunci;
    }
}
