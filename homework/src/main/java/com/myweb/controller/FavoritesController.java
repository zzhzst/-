package com.myweb.controller;

import com.myweb.commons.pojo.Message;
import com.myweb.pojo.Favorites;
import com.myweb.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/favorite")
public class FavoritesController {
    @Autowired
    FavoritesService favoritesService;

    @RequestMapping("/favorite")
    @ResponseBody
    public Message favorite(String jobName, String jobAddress,
                            String realname, Double jobSalary, String companyName) {
        Message  message=new Message();
        if(realname==null ||realname.isEmpty()){//判断用户是否登录
            message.setStr("您还没有登录！");
            return message;
        }
        Favorites favorites = favoritesService.findFavoriteByAll_(realname,jobAddress,jobName,companyName);
        Date date = new Date();
        String pattern = "yyyy年MM月dd日 HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String saveTime = simpleDateFormat.format(date);
        if(favorites==null){
            //插入职位具体数据
            Favorites favorites_=new Favorites();
            favorites_.setJobAddress(jobAddress);
            favorites_.setJobName(jobName);
            favorites_.setJobSalary(jobSalary);
            favorites_.setRealname(realname);
            favorites_.setReleaseTime(saveTime);//收藏时的时间
            favorites_.setCompanyName(companyName);
            int result=favoritesService.insertFavorite(favorites_);
            if(result==1){
                message.setStr("收藏成功！");
                return message;
            }else{
                message.setStr("不好意思，收藏失败！");
                return message;
            }
        }else{
            //第二次申请
            message.setStr("请不要重复收藏！");
            return message;
        }
    }

     //查询职位收藏记录
    @RequestMapping("/favoriteRecord")
    public String findFavoriteByRealName(String realname, Model model){
        List<Favorites> favoritesList= favoritesService.findFavoriteByRealName(realname);
        model.addAttribute("favoritesList", favoritesList);
        return "/favorite/showFavoriteListRecord";
    }

}
