package com.fp.mapper;

import com.fp.domain.news.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper {

    @Select("SELECT NID, NNAME, NTIME, T_NEWS.DID, DNAME, NCONTENT, NIMG FROM T_NEWS JOIN T_DOCTOR ON T_NEWS.DID=T_DOCTOR.DID WHERE NSTATE='001'")
    List<News> newsList();
    @Select("SELECT NID, NNAME, NTIME, T_NEWS.DID, DNAME, NCONTENT, NIMG FROM T_NEWS JOIN T_DOCTOR ON T_NEWS.DID=T_DOCTOR.DID WHERE T_NEWS.NID=#{Nid} AND NSTATE='001'")
    News newsByNid(Integer nid);
}
