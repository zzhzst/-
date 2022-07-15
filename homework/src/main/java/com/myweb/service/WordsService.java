package com.myweb.service;

import com.myweb.pojo.Words;

import java.util.List;

public interface WordsService {

    //新增留言
    int insertWords(Words words);

    //查看所有留言
    List<Words> findAllWords();

    //删除留言
    int deleteWordsById(Integer wid);
}
