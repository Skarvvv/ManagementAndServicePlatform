package com.fp.domain.news;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class News {
    private Integer nid;
    private String nname;
    private Timestamp ntime;
    private int did;
    private String dname;
    private String ncontent;
    private String nimg;
}
