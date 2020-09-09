package com.gorban.javadev;

import java.util.*;

public class ArraysSolutions {
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

    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length < 3){
            // throw Exception;
        }
        int length = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[++length] = nums[i];
            }
        }

        return length + 1;
    }

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++){
            if (nums[i] == 0){
                for (int j = i; j < length - 1; j++){
                    nums[j] = nums[j+1];
                }
                nums[length -1] = 0;
                length--;
                if (nums[i]==0){
                    i--;
                }
            }
        }
    }

    public int[] sortArrayByParity(int[] A) {
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 != 0){
                for (int j = i + 1; j < A.length; j++){
                    if (A[j] % 2 == 0){
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    }
                }
            }
        }
        return A;
    }

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i< A.length; i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public int heightChecker(int[] heights) {
        int movement = 0;
        for (int i = 0; i < heights.length; i++){
            int minValue = Integer.MAX_VALUE;
            int minValuePosition = 0;
            for (int j = i + 1; j < heights.length; j++){
                if (minValue > heights[j]){
                    minValue = heights[j];
                    minValuePosition = j;
                }
            }
            if (heights[i] > minValue){
                int temp = heights[i];
                heights[i] = heights[minValuePosition];
                heights[minValuePosition] = temp;
                movement++;
            }
        }

        return movement;
    }

    public int heightChecker2(int[] heights){
        int movements = 0;
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < heights.length; i++){
            if(heights[i] != sorted[i]){
                movements++;
            }
        }
        return movements;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNums = new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            disappearedNums.add(i+1);
        }

        for (int i=0; i< nums.length; i++){
            if (disappearedNums.contains(nums[i])){
                disappearedNums.remove(disappearedNums.indexOf(nums[i]));
            }
        }

        return disappearedNums;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        boolean[] appeared = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            appeared[nums[i] - 1] = true;
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < appeared.length; i++) {
            if (!appeared[i]) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        boolean minValueAppearsOnlyOnce = true;
        int counter = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secondMax && nums[i] != firstMax){
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (nums[i] > thirdMax && nums[i] != secondMax && nums[i] != firstMax){
                thirdMax = nums[i];
            } else if (nums[i] == Integer.MIN_VALUE && minValueAppearsOnlyOnce == true){
                minValueAppearsOnlyOnce = false;
            } else {
                continue;
            }
            counter++;
        }

        return counter > 2 ? thirdMax : firstMax;
    }
}
