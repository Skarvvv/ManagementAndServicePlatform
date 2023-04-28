package com.fp.domain.user;

import lombok.Data;

@Data
public class UserToDB {
    private int uid;
    private String ucode;
    private String uname;
    private String upassword;
    private String uavatar;
    private String urealname;
    private String ugender;
    private String ubirthday;
    private String utel;
    private String uidentity;
}
