package com.hikalearning;

public class QuestionQuiz6 {

    private String pertanyaan[] = {"モニング","パン","ゲム","ヌド","メンユ","ハネムン","ナイト","ミニスカト","ホム","プロゼクト"};
    private String jawabanbenar[] = {
            "MONINGU","PAN","GEMU","NUDO","MENYU","HANEMUN","NAITO","MINISUKATO","HOMU","PUROJEKUTO"
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
