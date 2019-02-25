package com.cet6;

/**
 * 用于封装单词意思的对象
 */
public class MeaningOfWords {

    /**
     * 单词的词性
     */
    private AttributeOfWords attribute;

    /**
     * 单词的意思
     */
    private String meaning;

    /**
     * 新建一个空的单词意思的对象：
     *  主要用于使用FastJson解析Json文件时需要使用空构造器创建对象
     */
    public MeaningOfWords() {
    }

    /**
     * 新建一个单词意思的对象
     *
     * @param attribute 单词的词性
     * @param meaning 单词的意思
     */
    public MeaningOfWords(AttributeOfWords attribute, String meaning) {
        this.attribute = attribute;
        this.meaning = meaning;
    }

    /**
     * @return 获取单词意思的对象的词性
     */
    public AttributeOfWords getAttribute() {
        return attribute;
    }

    /**
     * 设置单词意思的对象的词性
     *
     * @param attribute 单词的词性
     */
    public void setAttribute(AttributeOfWords attribute) {
        this.attribute = attribute;
    }

    /**
     * @return 获取单词的意思
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * 设置单词的意思
     *
     * @param meaning 单词的意思
     */
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "Meaning {" +
                "attribute=" + attribute +
                ", meaning='" + meaning + '\'' +
                '}';
    }
}
