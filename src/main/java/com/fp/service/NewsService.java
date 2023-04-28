package com.fp.service;

import com.fp.domain.news.NewsToDB;

import java.util.List;

public interface NewsService {
    List<NewsToDB> newsList();
    NewsToDB newsByNid(Integer nid);
}
