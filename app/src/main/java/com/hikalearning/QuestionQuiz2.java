package com.hikalearning;

public class QuestionQuiz2 {

    private String pertanyaan[] = {"A","E","I","O","U","KU","HI","TE","NA","NO","HE","SO","KO","GI","ME","RU","RO","MO","YA","RI"};
    private String jawaban[][] = {
            {"い","あ","え","お"},
            {"え","う","あ","お"},
            {"あ","え","お","い"},
            {"う","お","い","あ"},
            {"お","い","う","え"},
            {"く","へ","ま","な"},
            {"ひ","め","さ","く"},
            {"や","る","す","て"},
            {"そ","た","な","む"},
            {"ば","の","な","め"},
            {"て","へ","す","よ"},
            {"そ","こ","ざ","ひ"},
            {"け","ご","て","さ"},
            {"わ","き","さ","ぎ"},
            {"す","の","ね","め"},
            {"る","ろ","さ","と"},
            {"わ","る","ろ","ゆ"},
            {"ざ","も","は","な"},
            {"た","よ","て","や"},
            {"は","せ","り","ふ"}
    };
    private String jawabanbenar[] = {
            "あ","え","い","お","う","く","ひ","て","な","の","へ","そ","こ","ぎ","め","る","ろ","も","や","り"
    };

    public int getLength(){return pertanyaan.length;}

    public String getPertanyaan(int a){
        String question = pertanyaan[a];
        return question;
    }

    public String getPilihan(int index, int num){
        String choice = jawaban[index][num-1];
        return choice;
    }

    public String getJawBenar(int a){
        String benar = jawabanbenar[a];
        return benar;
    }
}
