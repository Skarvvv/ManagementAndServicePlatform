package com.fp.util;

public class ArrayHandler {

    public static int[] arrayFromStringToInt(String arrInString){
        int newLength = arrInString.length()/2;
        int[] newArr = new int[newLength];
        for (int i = 0;i<arrInString.length();i++){
            if (i%2!=0){
                int index = i/2;
                newArr[index] = (int) (arrInString.charAt(i) - '0');
            }
        }
        return newArr;
    }

}
