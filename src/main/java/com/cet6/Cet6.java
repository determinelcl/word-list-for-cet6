package com.cet6;

import com.cet6.words.WordList6;

import java.io.IOException;

public class Cet6 {

    public static void main(String[] args) {
        WordList6 wordList6 = new WordList6();
        System.out.println(wordList6.toString());
        try {
            wordList6.toJson();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
