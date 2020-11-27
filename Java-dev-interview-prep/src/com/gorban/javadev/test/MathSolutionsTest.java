package com.gorban.javadev.test;

import com.gorban.javadev.MathSolutions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathSolutionsTest {

    MathSolutions mathSolutions = new MathSolutions();
    @Test
    void calculateSqrt() {
        assertEquals(3, mathSolutions.calculateSqrt(9));
        assertEquals(2, mathSolutions.calculateSqrt(4));
        assertEquals(2, mathSolutions.calculateSqrt(5));
        assertEquals(3, mathSolutions.calculateSqrt(11));
    }

    @Test
    void calculateSquareRoot() {
        assertEquals(3, mathSolutions.calculateSquareRoot(9));
        assertEquals(2, mathSolutions.calculateSquareRoot(4));
        assertEquals(2, mathSolutions.calculateSquareRoot(5));
        assertEquals(3, mathSolutions.calculateSquareRoot(11));
    }
}