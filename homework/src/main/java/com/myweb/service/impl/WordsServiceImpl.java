package com.myweb.service.impl;

import com.myweb.mapper.WordsMapper;
import com.myweb.pojo.Words;
import com.myweb.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordsServiceImpl implements WordsService {
    @Autowired
    WordsMapper wordsMapper;

    @Override
    public int insertWords(Words words) {
        return wordsMapper.insertWords(words);
    }

    @Override
    public List<Words> findAllWords() {
        return wordsMapper.findAllWords();
    }

    @Override
    public int deleteWordsById(Integer wid) {
        return wordsMapper.deleteWordsById(wid);
    }
}
