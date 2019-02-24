package com.cet6.words;

import java.io.IOException;

public interface WordList {

    /**
     * 将单词对象序列化为Json
     */
    boolean toJson() throws IOException;

    /**
     * 加载Json文件为单词对象
     */
    boolean loadJson();
}
