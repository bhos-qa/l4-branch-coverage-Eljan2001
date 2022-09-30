package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myownclassTest {

    myownclass myCLASS = new myownclass();

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
    @Test
    void cube() {
        Assertions.assertEquals(27,myCLASS.cube(3));
    }
    @Test
    void quad() {
        Assertions.assertEquals(81,myCLASS.quad(3));
    }
    @Test
    void fifthpower() {
        Assertions.assertEquals(243,myCLASS.fifthpower(3));
    }
    @Test
    void sixthpower() {
        Assertions.assertEquals(829,myCLASS.sixthpower(3));
    }
    @Test
    void printitself() {
        Assertions.assertEquals(3,myCLASS.printitself(3));
    }
}