package com.fp.domain.news;

import lombok.Data;

@Data
public class NewsToDB {
    private Integer nid;
    private String nname;
    private String ntime;
    private int did;
    private String dname;
    private String ncontent;
    private String nimg;
}
