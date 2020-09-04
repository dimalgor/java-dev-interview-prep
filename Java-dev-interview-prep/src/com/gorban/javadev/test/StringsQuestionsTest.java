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
}