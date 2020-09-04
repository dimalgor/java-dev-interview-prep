package com.gorban.javadev;

public class StringsQuestions {

    public boolean isUniqueChars(String str){
        if (str.length() > 128){
            return false;
        }

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if (charSet[val]) {
                return false; // this char index is already exists, so the String contains duplicated characters
            } else {
                charSet[val] = true;
            }
        }
        return true;
    }
}
