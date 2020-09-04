package com.gorban.javadev.test;

import com.gorban.javadev.StringsQuestions;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
}