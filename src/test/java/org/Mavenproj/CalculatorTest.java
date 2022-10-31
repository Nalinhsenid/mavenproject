package org.Mavenproj;

import org.junit.jupiter.api.Test;

import java.lang.invoke.VarHandle;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void twoSquareEqualFour(){
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.square(2));
    }

}