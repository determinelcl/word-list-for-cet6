package com.cet6;

import java.util.List;

public class Word {

    private String english;
    private List<MeaningOfWords> meanings;

    public Word(String english, List<MeaningOfWords> meanings) {
        this.english = english;
        this.meanings = meanings;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public List<MeaningOfWords> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<MeaningOfWords> meanings) {
        this.meanings = meanings;
    }
}
