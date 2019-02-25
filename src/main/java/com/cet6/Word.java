package com.cet6;

import java.util.List;

/**
 * 用于描述单词的对象
 */
public class Word {

    /**
     * 英文单词
     */
    private String english;

    /**
     * 英文单词的意思
     */
    private List<MeaningOfWords> meanings;

    /**
     * 新建一个空的单词对象：
     *  主要用于使用FastJson解析Json文件时需要使用空构造器创建对象
     */
    public Word() {
    }

    /**
     * 新建一个单词对象
     *
     * @param english 英文单词
     * @param meanings 英文单词的意思
     */
    public Word(String english, List<MeaningOfWords> meanings) {
        this.english = english;
        this.meanings = meanings;
    }

    /**
     * @return 获取英文单词
     */
    public String getEnglish() {
        return english;
    }

    /**
     * 设置英文单词
     *
     * @param english 英文单词
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * @return 获取英文单词的意思
     */
    public List<MeaningOfWords> getMeanings() {
        return meanings;
    }

    /**
     * 设置英文单词的意思
     *
     * @param meanings 英文单词的意思
     */
    public void setMeanings(List<MeaningOfWords> meanings) {
        this.meanings = meanings;
    }

    @Override
    public String toString() {
        return "Word{" +
                "english='" + english + '\'' +
                ", meanings=" + meanings +
                '}';
    }
}
