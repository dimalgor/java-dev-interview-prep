package com.gorban.javadev;

import java.util.*;

public class StringsSolutions {

    public boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false; // this char index is already exists, so the String contains duplicated characters
            } else {
                charSet[val] = true;
            }
        }
        return true;
    }

    public String sort(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    public boolean isPermutatated(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    public boolean isPermutated2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] letters = new int[128]; //assumption
        char[] charArray = str1.toCharArray();

        for (char c : charArray) {
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            letters[c]--;

            if (letters.length < 0) {
                return false;
            }
        }

        return true;
    }

    public Set<String> getPermutations(String str){
        Set<String> permutations = new HashSet<>();
        if (str == null || str.length() == 0){
            permutations.add("");
        } else {
            char initialChar = str.charAt(0);
            String remainingStr = str.substring(1);

            Set<String> words = getPermutations(remainingStr);

            for (String word : words){
                for (int i = 0; i <= word.length(); i++){
                    permutations.add(placeCharAt(word, initialChar, i));
                }
            }
        }

        return  permutations;
    }

    private String placeCharAt(String str, char character, int indexToPlace){
        String begin = str.substring(0, indexToPlace);
        String end = str.substring(indexToPlace);
        return begin + character + end;
    }

    public String reverseEachWord(String str){
        StringBuffer finalString = new StringBuffer();
        String[] strArr = str.split(" ");

        for (String word : strArr){
            finalString.append(new StringBuffer(word).reverse());
            finalString.append(" ");
        }

        return finalString.toString().stripTrailing();
    }

    public HashMap<Character, Integer> getCharsOccurrence(String str){
        HashMap<Character, Integer> occurrencesMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars){
            if (occurrencesMap.containsKey(c)){
                occurrencesMap.put(c, occurrencesMap.get(c) + 1);
            } else {
                occurrencesMap.put(c, 1);
            }
        }
        return occurrencesMap;
    }

    public String reverseStringWithRecursion(String str){
        String recursiveString = recursiveSwap(str);

        return recursiveString;
    }

    private String recursiveSwap(String str){
        if (str == null || str.length() < 1){
            return str;
        } else {
            return recursiveSwap(str.substring(1)) + str.charAt(0);
        }
    }

    public String uRLifyString(String str){
        char[] spaceReplacementChars = new char[]{'%', '2', '0'};
        int spaceCounter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                spaceCounter++;
            }
        }
        char[] resultCharsArray = new char[str.length() + (spaceCounter * 2)];

        int j = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                for (int k = 0; k < spaceReplacementChars.length; k++){
                    resultCharsArray[j++] = spaceReplacementChars[k];
                }
            } else {
                resultCharsArray[j++] = str.charAt(i);
            }
        }

        return new String(resultCharsArray);
    }

    public boolean isPermutationOfPalindrome(String phrase) {
        int[] charFrequencyTable = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(charFrequencyTable);
    }

    private boolean checkMaxOneOdd(int[] table){
        boolean oddIsFound = false;
        for (int num : table){
            if (num % 2 == 1){
                if (!oddIsFound){
                    oddIsFound = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private int getCharNumericValue(Character c){
        int begin = Character.getNumericValue('a');
        int end = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (val >= begin && val <= end){
            return val - begin;
        } else return -1;
    }

    private int[] buildCharFrequencyTable(String phrase){
        int[] charFrequencyTable = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (Character c : phrase.toCharArray()){
            int charNumValue = getCharNumericValue(c);
            if (charNumValue != -1){
                charFrequencyTable[charNumValue]++;
            }
        }
        return charFrequencyTable;
    }

}
