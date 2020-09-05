package com.gorban.javadev.test;

import com.gorban.javadev.StringsQuestions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringsQuestionsTest {

    StringsQuestions stringsQuestions = new StringsQuestions();

    @Test
    void isUnique() {
        String strWithUniqueChars = "abcdefgh";
        String strWithDuplicatedChars = "abbcddeffghh";
        assertTrue(stringsQuestions.isUniqueChars(strWithUniqueChars));
        assertFalse(stringsQuestions.isUniqueChars(strWithDuplicatedChars));
    }

    @Test
    void sort() {
        String unsortedStr = "zaxbyc";
        String sortedStr = "abcxyz";
        assertEquals(sortedStr, stringsQuestions.sort(unsortedStr));
    }

    @Test
    void isPermutatated() {
        String initialStr = "dog";
        String permutatedStr = "god";
        assertTrue(stringsQuestions.isPermutatated(initialStr, permutatedStr));
    }

    @Test
    void isPermutated2() {
        String initialStr = "dog";
        String permutatedStr = "god";
        assertTrue(stringsQuestions.isPermutated2(initialStr, permutatedStr));
    }

    @Test
    void findNumbers() {
        int [] arr = {437,315,322,431,686,264,442};
        assertEquals(0, stringsQuestions.findNumbers(arr));
    }

    @Test
    void shiftIndexes() {
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] duplicatedZeroesArr = {1,0,0,2,3,0,0,4};
        boolean isDuplicationZeroesCorrect = true;
        stringsQuestions.duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != duplicatedZeroesArr[i]){
                isDuplicationZeroesCorrect = false;
                break;
            }
        }
        assertTrue(isDuplicationZeroesCorrect);
    }

    @Test
    void mergeSet1(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expectedNums = {1,2,2,3,5,6};
        stringsQuestions.merge(nums1, m, nums2,n);
        assertTrue(isEqual(nums1, expectedNums));
    }

    @Test
    void mergeSet2(){
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;
        int[] expectedNums = {1,2,3,4,5,6};
        stringsQuestions.merge(nums1, m, nums2,n);
        assertTrue(isEqual(nums1, expectedNums));
    }

    @Test
    void mergeSet3(){
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;
        int[] expectedNums = {-1,0,0,1,2,2,3,3,3};
        stringsQuestions.merge(nums1, m, nums2,n);
        assertTrue(isEqual(nums1, expectedNums));
    }
    private boolean isEqual(int[] nums1, int[] expectedNums){
        for (int i = 0; i < nums1.length; i++){
            if (nums1[i] != expectedNums[i]){
                return false;
            }
        }
        return true;
    }
}