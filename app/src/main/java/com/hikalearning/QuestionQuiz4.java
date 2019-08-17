package com.hikalearning;

public class QuestionQuiz4 {

    private String pertanyaan[] = {"ア","エ","イ","オ","ウ","ク","ヒ","テ","ナ","ノ","ヘ","ソ","コ","ギ","メ","ル","ロ","モ","ヤ","リ"};
    private String jawaban[][] = {
            {"I","A","E","O"},
            {"E","U","A","O"},
            {"A","E","O","I"},
            {"U","O","I","A"},
            {"O","I","U","E"},
            {"KU","HE","MA","NA"},
            {"HI","ME","SA","KU"},
            {"YA","RU","SU","TE"},
            {"SO","TA","NA","MU"},
            {"BA","NO","NA","ME"},
            {"TE","HE","SU","YO"},
            {"SO","KO","ZA","HI"},
            {"KE","GO","KO","SA"},
            {"WA","KI","SA","GI"},
            {"SU","NO","NE","ME"},
            {"RU","RO","SA","TO"},
            {"WA","RU","RO","YU"},
            {"ZA","MO","HA","NA"},
            {"TA","YO","TE","YA"},
            {"HA","SE","RI","HU"}
    };
    private String jawabanbenar[] = {
      "A","E","I","O","U","KU","HI","TE","NA","NO","HE","SO","KO","GI","ME","RU","RO","MO","YA","RI"
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
