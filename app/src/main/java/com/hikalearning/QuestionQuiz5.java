package com.hikalearning;

public class QuestionQuiz5 {

    private String pertanyaan[] = {"A","E","I","O","U","KU","HI","TE","NA","NO","HE","SO","KO","GI","ME","RU","RO","MO","YA","RI"};
    private String jawaban[][] = {
            {"イ","ア","エ","オ"},
            {"エ","ウ","ア","オ"},
            {"ア","エ","オ","イ"},
            {"ウ","オ","イ","ア"},
            {"オ","イ","ウ","エ"},
            {"ク","ヘ","マ","ナ"},
            {"ヒ","メ","サ","ク"},
            {"ヤ","ル","ス","テ"},
            {"ソ","タ","ナ","ム"},
            {"バ","ノ","ナ","メ"},
            {"テ","ヘ","ス","ヨ"},
            {"ソ","コ","ザ","ヒ"},
            {"ケ","ゴ","コ","サ"},
            {"ワ","キ","サ","ギ"},
            {"ス","ノ","ネ","メ"},
            {"ル","ロ","サ","ト"},
            {"ワ","ル","ロ","ユ"},
            {"ザ","モ","ハ","ナ"},
            {"タ","ヨ","テ","ヤ"},
            {"ハ","セ","リ","フ"}
    };
    private String jawabanbenar[] = {
            "ア","エ","イ","オ","ウ","ク","ヒ","テ","ナ","ノ","ヘ","ソ","コ","ギ","メ","ル","ロ","モ","ヤ","リ"
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
