package com.myweb.service;

import com.myweb.pojo.Favorites;

import java.util.List;

public interface FavoritesService {
    //插入新的收藏
    int insertFavorite(Favorites favorites_);

    //判断是否第一次收藏
    public Favorites findFavoriteByAll_(String realname, String jobAddress, String jobName, String companyName);

    List<Favorites> findFavoriteByRealName(String realname);
}
