package com.gorban.javadev.test;

import com.gorban.javadev.ArraysSolutions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysSolutionsTest {

    ArraysSolutions arraysSolutions = new ArraysSolutions();

    @Test
    void findNumbers() {
        int [] arr = {437,315,322,431,686,264,442};
        assertEquals(0, arraysSolutions.findNumbers(arr));
    }

    @Test
    void shiftIndexes() {
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] duplicatedZeroesArr = {1,0,0,2,3,0,0,4};
        boolean isDuplicationZeroesCorrect = true;
        arraysSolutions.duplicateZeros(arr);
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
        arraysSolutions.merge(nums1, m, nums2,n);
        assertTrue(isEqual(nums1, expectedNums));
    }

    @Test
    void mergeSet2(){
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;
        int[] expectedNums = {1,2,3,4,5,6};
        arraysSolutions.merge(nums1, m, nums2,n);
        assertTrue(isEqual(nums1, expectedNums));
    }

    @Test
    void mergeSet3(){
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;
        int[] expectedNums = {-1,0,0,1,2,2,3,3,3};
        arraysSolutions.merge(nums1, m, nums2,n);
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

    private boolean checkEqualityTillLength(int[] nums1, int[] expectedNums, int length){
        for (int i = 0; i < length; i++){
            if (nums1[i] != expectedNums[i]){
                return false;
            }
        }
        return true;
    }

    @Test
    void removeElement() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int expectedLength = 2;
        int[] expectedArr = {2,2,0,0};
        int newLength = arraysSolutions.removeElement(nums, val);
        assertEquals(expectedLength,newLength);
        assertTrue(isEqual(nums, expectedArr));
    }

    @Test
    void removeElement2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int expectedLength = 5;
        int[] expectedArr = {0,1,3,0,4,0,0,0};
        int newLength = arraysSolutions.removeElement(nums, val);
        assertEquals(expectedLength,newLength);
        assertTrue(isEqual(nums, expectedArr));
    }

    @Test
    void removeElement3() {
        int[] nums = {4,4,0,1,0,2};
        int val = 0;
        int expectedLength = 4;
        int[] expectedArr = {4,4,1,2,0,0};
        int newLength = arraysSolutions.removeElement(nums, val);
        assertEquals(expectedLength,newLength);
        assertTrue(isEqual(nums, expectedArr));
    }

    @Test
    void removeDuplicates() {
        int[] nums = {1,1,2};
        int[] expectedArr = {1,2,0};
        int expectedLength = 2;
        int newLength = arraysSolutions.removeDuplicates(nums);
        assertEquals(expectedLength,newLength);
        assertTrue(isEqual(nums, expectedArr));
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedArr = {0,1,2,3,4,0,0,0,0,0};
        int expectedLength = 5;
        int newLength = arraysSolutions.removeDuplicates(nums);
        assertEquals(expectedLength,newLength);
        assertTrue(isEqual(nums, expectedArr));
    }

    @Test
    void checkIfExist() {
        int[] arr = {10,2,5,3};
        assertTrue(arraysSolutions.checkIfExist(arr));
    }

    @Test
    void checkIfExist2() {
        int[] arr = {7,1,14,11};
        assertTrue(arraysSolutions.checkIfExist(arr));
    }

    @Test
    void checkIfExist3() {
        int[] arr = {3,1,7,11};
        assertFalse(arraysSolutions.checkIfExist(arr));
    }

    @Test
    void checkIfExist4() {
        int[] arr = {-10,12,-20,-8,15};
        assertTrue(arraysSolutions.checkIfExist(arr));
    }

    @Test
    void checkIfExist5() {
        int[] arr = {-20,8,-6,-14,0,-19,14,4};
        assertTrue(arraysSolutions.checkIfExist(arr));
    }

    @Test
    void checkIfExist6() {
        int[] arr = {-2,0,10,-19,4,6,-8};
        assertFalse(arraysSolutions.checkIfExist(arr));
    }

    @Test
    void checkIfExist7() {
        int[] arr = {0,0,};
        assertTrue(arraysSolutions.checkIfExist(arr));
    }

    @Test
    void validMountainArray() {
        int[] A = {0,3,2,1};
        assertTrue(arraysSolutions.validMountainArray(A));
    }

    @Test
    void validMountainArray2() {
        int[] A = {2,1};
        assertFalse(arraysSolutions.validMountainArray(A));
    }

    @Test
    void validMountainArray3() {
        int[] A = {3,5,5};
        assertFalse(arraysSolutions.validMountainArray(A));
    }

    @Test
    void validMountainArray4() {
        int[] A = {2,0,2};
        assertFalse(arraysSolutions.validMountainArray(A));
    }

    @Test
    void validMountainArray5() {
        int[] A = {0,1,2,1,2};
        assertFalse(arraysSolutions.validMountainArray(A));
    }

    @Test
    void replaceElements() {
        int[] arr = {17,18,5,4,6,1};
        int[] expectedArr = {18,6,6,6,1,-1};
        int[] outputArr = arraysSolutions.replaceElements(arr);
        assertTrue(isEqual(outputArr, expectedArr));
    }

    @Test
    void testRemoveDuplicates2() {
        int[] arr = {1,1,2};
        int[] expectedArr = {1,2,2};
        int expectedArrLength = 2;
        int newArrLength = arraysSolutions.removeDuplicates2(arr);
        assertEquals(newArrLength, expectedArrLength);
        assertTrue(checkEqualityTillLength(arr,expectedArr,newArrLength));
    }

    @Test
    void testRemoveDuplicates3() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedArr = {0,1,2,3,4,2,2,3,3,4};
        int expectedArrLength = 5;
        int newArrLength = arraysSolutions.removeDuplicates2(arr);
        assertEquals(newArrLength, expectedArrLength);
        assertTrue(checkEqualityTillLength(arr,expectedArr,newArrLength));
    }

    @Test
    void moveZeroes() {
        int [] arr = {0,1,0,3,12};
        int [] expectedArr = {1,3,12,0,0};
        arraysSolutions.moveZeroes(arr);
        assertTrue(isEqual(arr, expectedArr));
    }

    @Test
    void moveZeroes2() {
        int [] arr = {0,0,1};
        int [] expectedArr = {1,0,0};
        arraysSolutions.moveZeroes(arr);
        assertTrue(isEqual(arr, expectedArr));
    }

    @Test
    void sortArrayByParity() {
        int [] arr = {3,1,2,4};
        int [] expectedArr = {2,4,3,1};
        arraysSolutions.sortArrayByParity(arr);
        assertTrue(isEqual(arr, expectedArr));
    }

    @Test
    void sortedSquares() {
        int[] arr = {-4,-1,0,3,10};
        int[] expectedArr = {0,1,9,16,100};
        arraysSolutions.sortedSquares(arr);
        assertTrue(isEqual(arr, expectedArr));
    }

    @Test
    void sortedSquares2() {
        int[] arr = {-7,-3,2,3,11};
        int[] expectedArr = {4,9,9,49,121};
        arraysSolutions.sortedSquares(arr);
        assertTrue(isEqual(arr, expectedArr));
    }

    @Test
    void heightChecker() {
        int[] arr = {1,1,4,2,1,3};
        int expectedMovements = 3;
        int movements = arraysSolutions.heightChecker2(arr);
        assertEquals(expectedMovements, movements);
    }

    @Test
    void heightChecker2() {
        int[] arr = {5,1,2,3,4};
        int expectedMovements = 5;
        int movements = arraysSolutions.heightChecker2(arr);
        assertEquals(expectedMovements, movements);
    }

    @Test
    void heightChecker3() {
        int[] arr = {1,2,3,4,5};
        int expectedMovements = 0;
        int movements = arraysSolutions.heightChecker2(arr);
        assertEquals(expectedMovements, movements);
    }


    @Test
    void findDisappearedNumbers() {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(5,6));
        List<Integer> retrievedList = arraysSolutions.findDisappearedNumbers2(arr);
        boolean isEqual = true;
        for (int i = 0; i < retrievedList.size(); i++){
            if (expectedList.get(i) != retrievedList.get(i)){
                isEqual = false;
                break;
            }
        }
        assertTrue(isEqual);
    }
}
