package com.cet6;

/**
 * 用于描述单词的词性的枚举
 */
public enum AttributeOfWords {
    PREP("介系词", "（介词）；前置词，preposition的缩写"),
    PRON("代名词", "（代词），pronoun的缩写"),
    N("名词", "noun的缩写"),
    V("动词", "兼指及物动词和不及物动词，verb的缩写"),
    CONJ("连接词", "conjunction的缩写"),
    S("主词", "主语"),
    SC("主词补语", "（有两种说法，一种表示主语补语=表语，一种表示一般表语属于主语补语）"),
    O("宾语", "受词"),
    OC("宾语补足语", "受词补语"),
    VI("不及物动词", "intransitive verb的缩写"),
    VT("及物动词", "transitive verb的缩写"),
    AUX_V("助动词", "auxiliary的缩写"),
    ADJ("形容词", "adjective的缩写"),
    ADV("副词", "adverb的缩写"),
    ART("冠词", "article的缩写"),
    NUM("数词", "numeral的缩写"),
    INT_("感叹词", "interjection的缩写"),
    U("不可数名词", "uncountable noun的缩写"),
    C("可数名词", "countable noun的缩写"),
    PL("复数", "plural的缩写");

    /**
     * 词性枚举的意思
     */
    private String mean;

    /**
     * 词性枚举意思的描述
     */
    private String desc;

    /**
     * 新建一个单词词性的枚举，适用于内部对象的新建
     *
     * @param mean 词性枚举的意思
     * @param desc 词性枚举意思的描述
     */
    AttributeOfWords(String mean, String desc) {
        this.mean = mean;
        this.desc = desc;
    }

    /**
     * @return 获取词性枚举所表示的意思
     */
    public String getMean() {
        return mean;
    }

    /**
     * @return 获取词性枚举意思的描述
     */
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Attr.{" +
                "mean='" + mean + "', " +
                "desc='" + desc + "'" +
                '}';
    }
}

