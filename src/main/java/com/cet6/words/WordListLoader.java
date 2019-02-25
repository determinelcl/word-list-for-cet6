package com.cet6.words;

import com.alibaba.fastjson.JSON;
import com.cet6.Word;

import java.io.*;
import java.util.List;

/**
 * 第六单元单词
 */
public class WordListLoader implements WordList {

    /**
     * 用于保存单词列表的对象
     */
    private List<Word> words = null;

    /**
     * 新建一个单词列表对象
     */
    public WordListLoader() {
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return "WordListLoader{" +
                "words=" + words +
                '}';
    }

    @Override
    public void toJson(String filename) throws IOException {
        if (words == null || words.size() == 0)
            throw new RuntimeException("写入Json文件的单词列表不能为空");

        // 将单词列表序列化为文件
        String wordList = JSON.toJSONString(words, true);
        BufferedOutputStream outputStream = new BufferedOutputStream(
                new FileOutputStream(new File(filename)));

        outputStream.write(wordList.getBytes());
        outputStream.flush();
        outputStream.close();
    }

    @Override
    public void loadJson(String filename) throws IOException {
        // 读取Json文件
        BufferedInputStream inputStream = new BufferedInputStream(
                new FileInputStream(new File(filename)));
        byte[] buffer = new byte[1024];
        int flag;
        StringBuilder content = new StringBuilder();
        while ((flag = inputStream.read(buffer)) != -1)
            content.append(new String(buffer, 0, flag));

        inputStream.close();

        // 将Json转换为单词列表对象
        words = JSON.parseArray(content.toString(), Word.class);
    }
}
