package com.fp.controller;

import com.fp.domain.news.NewsToDB;
import com.fp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @GetMapping("newsList")
    public List<NewsToDB> newsList(){
        return newsService.newsList();
    }
    @GetMapping("newsByNid")
    public NewsToDB newsByNid(Integer nid){
        return newsService.newsByNid(nid);
    }
}
