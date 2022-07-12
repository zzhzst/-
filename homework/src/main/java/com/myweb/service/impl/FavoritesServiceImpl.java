package com.myweb.service.impl;

import com.myweb.mapper.FavoritesMapper;
import com.myweb.pojo.Favorites;
import com.myweb.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesServiceImpl implements FavoritesService {
    @Autowired
    FavoritesMapper favoritesMapper;

    @Override
    public int insertFavorite(Favorites favorites_) {
        return favoritesMapper.insertFavorite(favorites_);
    }

    @Override
    public Favorites findFavoriteByAll_(String realname, String jobAddress, String jobName, String companyName) {
        return favoritesMapper.findFavoriteByAll_(realname,jobAddress,jobName,companyName);
    }

    @Override
    public List<Favorites> findFavoriteByRealName(String realname) {
        return favoritesMapper.findFavoriteByRealName(realname);
    }
}
