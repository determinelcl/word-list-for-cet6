package com.cet6;

public class MeaningOfWords {
    private AttributeOfWords attribute;
    private String meaning;

    public MeaningOfWords(AttributeOfWords attribute, String meaning) {
        this.attribute = attribute;
        this.meaning = meaning;
    }

    public AttributeOfWords getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeOfWords attribute) {
        this.attribute = attribute;
    }

    public String getMeaning() {
        return meaning;
    }

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
