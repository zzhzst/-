package com.myweb.controller;

import com.myweb.commons.pojo.Message;
import com.myweb.pojo.User;
import com.myweb.pojo.Words;
import com.myweb.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/words")
public class WordsController {

    @Autowired
    WordsService wordsService;

    @RequestMapping("/insertWords")
    @ResponseBody
    public Message insertWords(String content, HttpSession session){

        Message message = new Message();
        User user = (User) session.getAttribute("currUser");
        String realname = user.getRealname();
        Words words = new Words();
        words.setRealname(realname);
        words.setContent(content);
        int num = wordsService.insertWords(words);
        if(num==1){
            message.setStr("success");
            return message;
        }else {
            message.setStr("fail");
            return message;
        }
    }

    //用户查询所有留言
    @RequestMapping("/findAllWords")
    public String findAllWords(Model model){
        List<Words> wordsList=wordsService.findAllWords();
        model.addAttribute("wordsList",wordsList);
        return "/words/messageboard";
    }

    //用户查询所有留言
    @RequestMapping("/adminFindAllWords")
    public String adminFindAllWords(Model model){
        List<Words> wordsList=wordsService.findAllWords();
        model.addAttribute("wordsList",wordsList);
        return "/words/showWords";
    }

    //删除留言
    @RequestMapping("/deleteWordsById")
    public String deleteWordsById(Integer wid){
        int num = wordsService.deleteWordsById(wid);
        return  "redirect:/words/adminFindAllWords";
    }
}
