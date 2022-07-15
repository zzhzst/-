package com.myweb.mapper;

import com.myweb.pojo.Words;

import java.util.List;

public interface WordsMapper {

    //新增留言
    int insertWords(Words words);

    //查询所有留言
    List<Words> findAllWords();

    //删除留言
    int deleteWordsById(Integer wid);
}
