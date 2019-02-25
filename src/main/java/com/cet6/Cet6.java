package com.cet6;

import com.cet6.words.WordList;
import com.cet6.words.WordListLoader;

import java.io.IOException;

public class Cet6 {

    public static void main(String[] args) {
        WordList wordList6 = new WordListLoader();
        try {
//            wordList6.toJson("./word_list6.json");
            wordList6.loadJson("./word_list6.json");
            System.out.println(wordList6.getWords());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
