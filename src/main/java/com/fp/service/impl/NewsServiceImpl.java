package com.fp.service.impl;

import com.fp.domain.news.News;
import com.fp.domain.news.NewsToDB;
import com.fp.mapper.NewsMapper;
import com.fp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<NewsToDB> newsList() {
        List<News> newses = newsMapper.newsList();
        List<NewsToDB> newsToDBList = new ArrayList<>();
        for (News news : newses){
            NewsToDB newsToDB = new NewsToDB();
            newsToDB.setNid(news.getNid());
            newsToDB.setNname(news.getNname());
            newsToDB.setNtime(news.getNtime().toString().substring(0, news.getNtime().toString().length()-2));
            newsToDB.setDid(news.getDid());
            newsToDB.setDname(news.getDname());
            newsToDB.setNcontent(news.getNcontent());
            newsToDB.setNimg(news.getNimg());
            newsToDBList.add(newsToDB);
        }
        return newsToDBList;
    }

    @Override
    public NewsToDB newsByNid(Integer nid) {
        News news = newsMapper.newsByNid(nid);
        NewsToDB newsToDB = new NewsToDB();
        newsToDB.setNid(news.getNid());
        newsToDB.setNname(news.getNname());
        newsToDB.setNtime(news.getNtime().toString().substring(0, news.getNtime().toString().length()-2));
        newsToDB.setDid(news.getDid());
        newsToDB.setDname(news.getDname());
        newsToDB.setNcontent(news.getNcontent());
        newsToDB.setNimg(news.getNimg());
        return newsToDB;
    }
}
