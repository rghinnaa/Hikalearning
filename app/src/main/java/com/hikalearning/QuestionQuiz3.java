package com.hikalearning;

public class QuestionQuiz3 {

    private String pertanyaan[] = {"あきら","たべもの","おかさん","ろにん","みかん","うそ","ぁかい","えき","やき","そこ"};
    private String jawabanbenar[] = {
            "AKIRA","TABEMONO","OKASAN","RONIN","MIKAN","USO","AKAI","EKI","YAKI","SOKO"
    };

    public int getLength(){return pertanyaan.length;}

    public String getPertanyaan(int a){
        String question = pertanyaan[a];
        return question;
    }

    public String getJawBenar(int a){
        String benar = jawabanbenar[a];
        return benar;
    }
}
