package com.gorban.javadev.test;

import com.gorban.javadev.ArraysSolutions;
import com.gorban.javadev.StringsSolutions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StringsSolutionsTest {

    StringsSolutions stringsSolutions = new StringsSolutions();

    @Test
    void isUnique() {
        String strWithUniqueChars = "abcdefgh";
        String strWithDuplicatedChars = "abbcddeffghh";
        assertTrue(stringsSolutions.isUniqueChars(strWithUniqueChars));
        assertFalse(stringsSolutions.isUniqueChars(strWithDuplicatedChars));
    }

    @Test
    void sort() {
        String unsortedStr = "zaxbyc";
        String sortedStr = "abcxyz";
        assertEquals(sortedStr, stringsSolutions.sort(unsortedStr));
    }

    @Test
    void isPermutatated() {
        String initialStr = "dog";
        String permutatedStr = "god";
        assertTrue(stringsSolutions.isPermutatated(initialStr, permutatedStr));
    }

    @Test
    void isPermutated2() {
        String initialStr = "dog";
        String permutatedStr = "god";
        assertTrue(stringsSolutions.isPermutated2(initialStr, permutatedStr));
    }

    @Test
    void checkStringsPool(){
        String strLiteral = "string literal will be stored in the string pool";
        String strLiteral2 = "string literal will be stored in the string pool";
        assertTrue(strLiteral == strLiteral2);
        assertEquals(strLiteral, strLiteral2);
        String newStr = new String("new string instance will be stored in the heap");
        String newStr2 = new String("new string instance will be stored in the heap");
        assertFalse(newStr == newStr2);
        assertEquals(newStr,newStr2);
        assertTrue(newStr.intern() == newStr2.intern());
    }

    @Test
    void getPermutations() {
        String str = "ABC";
        Set<String> expectedPermutations = new HashSet<>(Arrays.asList("ACB, BCA, ABC, CBA, BAC, CAB"));
        Set<String> permutations = stringsSolutions.getPermutations(str);
        System.out.println(expectedPermutations);
        System.out.println(permutations);
    }

    @Test
    void reverseEachWord() {
        String str = "how to do in java dot com";
        String expectedStr = "woh ot od ni avaj tod moc";
        String reversed = stringsSolutions.reverseEachWord(str);
        assertEquals(expectedStr, reversed);
    }

    @Test
    void getCharsOccurrence() {
        String blogName = "howToDoInJava";
        HashMap<Character, Integer> expectedOccurrences = new HashMap<Character, Integer>();
        expectedOccurrences.put('a', 2);
        expectedOccurrences.put('T', 1);
        expectedOccurrences.put('D', 1);
        expectedOccurrences.put('v', 1);
        expectedOccurrences.put('w', 1);
        expectedOccurrences.put('h', 1);
        expectedOccurrences.put('I', 1);
        expectedOccurrences.put('J', 1);
        expectedOccurrences.put('n', 1);
        expectedOccurrences.put('o', 3);
        HashMap<Character, Integer> occurrencesMap = stringsSolutions.getCharsOccurrence(blogName);
        assertEquals(expectedOccurrences, occurrencesMap);
    }

    @Test
    void reverseStringWithRecursion() {
        String str = "howToDoInJava";
        String expectedReversedStr = "avaJnIoDoTwoh";
        String reversedStr = stringsSolutions.reverseStringWithRecursion(str);
        assertEquals(expectedReversedStr, reversedStr);
    }

    @Test
    void uRLifyString() {
        String usualStr = "Mr John Smith";
        String expectedUrlifiedStr = "Mr%20John%20Smith";
        String urlifiedStr = stringsSolutions.uRLifyString(usualStr);
        assertEquals(expectedUrlifiedStr, urlifiedStr);
    }

    @Test
    void isPermutationOfPalindrome() {
        String palindrome = "tacocat";
        assertTrue(stringsSolutions.isPermutationOfPalindrome(palindrome));
        String notPalindrome = "tacocati";
        assertFalse(stringsSolutions.isPermutationOfPalindrome(notPalindrome));
    }
}