package com.mycom.word;

public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;

    Word() {}
    Word(int id, int level, String word, String meaning){
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String toString() {
        String levels = "";
        for(int i = 0; i<level; i++) levels += "*";
        return String.format("%-3s", levels) + String.format("%7s", word) + "  " + meaning;
    }
}

