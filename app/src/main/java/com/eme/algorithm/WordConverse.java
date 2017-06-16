package com.eme.algorithm;

import android.text.TextUtils;

/**
 *
 * 单词反转算法
 *
 * Created by dijiaoliang on 17/6/16.
 */
public class WordConverse {

    /**
     * 反转字符串
     * @param word
     * @return
     */
    public static String converse(String word){
        if(TextUtils.isEmpty(word)){
            return word;
        }
        int length=word.length();
        if(length<2){
            return word;
        }
        char[] chars=word.toCharArray();
        for (int i=0;i<length/2;i++){
            char temp=chars[i];
            chars[i]=chars[length-1-i];
            chars[length-1-i]=temp;
        }
        return String.valueOf(chars);
    }
}
