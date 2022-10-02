package org.example;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Myownclass1$Test {
    Myownclass1$Test myCLASS;
    @BeforeEach
    void setUp() {myCLASS = new Myownclass1$Test(); }

    @Test
    void addNumbers() {
        Assertions.assertEquals(2,myCLASS.addNumbers(1,1));
    }

    @Test
    void subtractNumbers() {
        Assertions.assertEquals(0,myCLASS.subtractNumbers(1,1));
    }

    @Test
    void multiplyNumbers() {
        Assertions.assertEquals(1,myCLASS.multiplyNumbers(1,1));
    }

    @Test
    void divideNumbers() {
        Assertions.assertEquals(1,myCLASS.divideNumbers(1,1));
    }

    @Test
    void square() {
        Assertions.assertEquals(9,myCLASS.square(3));
    }

}