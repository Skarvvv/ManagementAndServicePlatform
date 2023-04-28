package com.fp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 处理微信传递过来的时间格式
 * 2023年4月15日18时30分 -> 2023-04-15 18:30:00
 */
public class TimeHandler {
    private static String handleTime(String timeInFromWX){
        return timeInFromWX.replace("年","-")
                .replace("月", "-")
                .replace("日", " ")
                .replace("时", ":")
                .replace("分", ":") + "00";

    }

    public static long handleTimeToLong(String timeFromWX) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(handleTime(timeFromWX)).getTime();
    }
    private static String handleDate(String dateFromWX){
        return dateFromWX.replace("年","-")
                .replace("月", "-")
                .replace("日", "");
    }

    public static long handleDateToLong(String dayForWX) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(handleTime(dayForWX)).getTime();
    }

}
