package com.cet6.words;

import com.cet6.AttributeOfWords;
import com.cet6.MeaningOfWords;
import com.cet6.Word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordList6 {

    private List<Word> words;

    public WordList6() {
        words = new ArrayList<>();
        words.add(new Word("poetry", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "诗，诗歌，诗集"))));

        words.add(new Word("highlight", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "最精彩的部分，最重要的事件 "),
                new MeaningOfWords(AttributeOfWords.VT, "强调，突出，使显著"))));

        words.add(new Word("slash", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "砍，砍痕，斜线 "),
                new MeaningOfWords(AttributeOfWords.VT, "砍，大幅度削减"))));

        words.add(new Word("ambition", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "雄心，抱负；野心；期望得到的东西"))));

        words.add(new Word("reassure", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "使放心"))));

        words.add(new Word("abundance", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "大量，丰富，充足"))));

        words.add(new Word("prosperous", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "繁荣的，兴旺的"))));

        words.add(new Word("submit", newMeaning(
                new MeaningOfWords(AttributeOfWords.V, "屈从，听从，服从；呈送，提交；主张，建议"))));

        words.add(new Word("differentiate", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "区分，区别；使不同，是有差异"),
                new MeaningOfWords(AttributeOfWords.VI, "区分"))));


    }

    private static List<MeaningOfWords> newMeaning(MeaningOfWords... meaningOfWords) {
        return Arrays.asList(meaningOfWords);
    }


    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return "WordList6{" +
                "words=" + words +
                '}';
    }
}
