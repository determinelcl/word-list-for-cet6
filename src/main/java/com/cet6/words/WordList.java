package com.cet6.words;

import com.cet6.Word;

import java.io.IOException;
import java.util.List;

/**
 * 用于提供统一操作方法的接口，所有的单词列表对象都必须实现此接口。<br/>
 * · 方法为读取单词文件和写入单词文件
 */
public interface WordList {

    /**
     * @return 获取单词列表对象
     */
    List<Word> getWords();

    /**
     * 将单词对象序列化为Json
     * @param filename 保存的Json文件名
     * @throws IOException 用于文件写入时操作文件将会抛出的异常
     */
    void toJson(String filename) throws IOException;

    /**
     * 加载Json文件为单词对象
     * @param filename 需要加载的Json文件名
     */
    void loadJson(String filename) throws IOException;
}
