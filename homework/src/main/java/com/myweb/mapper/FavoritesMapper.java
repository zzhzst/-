package com.myweb.mapper;

import com.myweb.pojo.Favorites;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FavoritesMapper {
    //插入新的收藏
    int insertFavorite(Favorites favorites_);

    //判断是否第一次收藏
    Favorites findFavoriteByAll_(@Param("realname") String realname, @Param("jobAddress") String jobAddress,
                                 @Param("jobName") String jobName, @Param("companyName") String companyName);

    //根据真实姓名查询收藏记录
    List<Favorites> findFavoriteByRealName(String realname);

    //根据收藏的id删除
    int deleteFavoritesById(Integer fid);
}
