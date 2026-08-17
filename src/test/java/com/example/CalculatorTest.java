package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addMethod() {
        Calculator calc = new Calculator();
        assertEquals(20,calc.addMethod(15,5));
    }
    @Test
    void subMethod() {
        Calculator calc = new Calculator();
        assertEquals(10,calc.subMethod(15,5));
    }
}