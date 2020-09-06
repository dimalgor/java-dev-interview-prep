package com.gorban.javadev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringsQuestions {

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

    public int findNumbers(int[] nums) {
        int evenNumDigits = 0;
        int numDigitsCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {
                num = num / 10;
                numDigitsCounter++;
            }
            if (numDigitsCounter % 2 == 0) {
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

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[--length] = 0;
                i--;
            }
        }

        return length;
    }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[--length] = 0;
                i--;
            }
        }

        return length;
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet();
        for (Integer i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }
        boolean isStrictlyIncreasing = false;
        boolean isStrictlyDecreasing = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1] && isStrictlyDecreasing == false) {
                isStrictlyIncreasing = true;
            } else if (A[i] == A[i + 1]) {
                return false;
            } else if (A[i] > A[i + 1]  && isStrictlyIncreasing == true) {
                isStrictlyDecreasing = true;
            } else {
                return false;
            }
        }

        return isStrictlyIncreasing && isStrictlyDecreasing;
    }

    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1) {
                arr[i] = -1;
            } else {
                int max = 0;
                for (int j = i+1; j < arr.length; j++){
                    if (arr[j] > max){
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }
        return arr;
    }
}
