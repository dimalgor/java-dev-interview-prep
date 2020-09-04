package com.gorban.javadev;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public String sort(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    public boolean isPermutatated(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    public boolean isPermutated2(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] letters = new int[128]; //assumption
        char[] charArray = str1.toCharArray();

        for (char c : charArray){
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++){
            char c = str2.charAt(i);
            letters[c]--;

            if (letters.length < 0) {
                return false;
            }
        }

        return true;
    }

    public int findNumbers(int[] nums) {
        int evenNumDigits = 0;
        int numDigitsCounter = 0;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {
                num = num / 10;
                numDigitsCounter++;
            }
            if (numDigitsCounter % 2 == 0){
                evenNumDigits++;
            }
            numDigitsCounter = 0;
        }

        return evenNumDigits;
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}
