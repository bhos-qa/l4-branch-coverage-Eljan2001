package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Myownclass1$ {

    myownclass myCLASS = new myownclass();

    @Test
    void addNumbers() {
        Assertions.assertEquals(2,myCLASS.addNumbers(1,1));
        Assertions.assertEquals(20,myCLASS.addNumbers(10,10));
        Assertions.assertEquals(200,myCLASS.addNumbers(100,100));
        Assertions.assertEquals(2000,myCLASS.addNumbers(1000,1000));
    }

    @Test
    void subtractNumbers() {
        Assertions.assertEquals(0,myCLASS.subtractNumbers(1,1));
        Assertions.assertEquals(1,myCLASS.subtractNumbers(2,1));
        Assertions.assertEquals(2,myCLASS.subtractNumbers(3,1));
        Assertions.assertEquals(3,myCLASS.subtractNumbers(4,1));
    }

    @Test
    void multiplyNumbers() {
        Assertions.assertEquals(1,myCLASS.multiplyNumbers(1,1));
        Assertions.assertEquals(2,myCLASS.multiplyNumbers(2,1));
        Assertions.assertEquals(4,myCLASS.multiplyNumbers(2,2));
        Assertions.assertEquals(10,myCLASS.multiplyNumbers(5,2));
    }

    @Test
    void divideNumbers() {
        Assertions.assertEquals(1,myCLASS.divideNumbers(1,1));
        Assertions.assertEquals(2,myCLASS.divideNumbers(2,1));
        Assertions.assertEquals(4,myCLASS.divideNumbers(8,2));
        Assertions.assertEquals(6,myCLASS.divideNumbers(36,6));
    }

    @Test
    void square() {
        Assertions.assertEquals(9,myCLASS.square(3));
        Assertions.assertEquals(81,myCLASS.square(9));
        Assertions.assertEquals(36,myCLASS.square(6));
        Assertions.assertEquals(100,myCLASS.square(10));
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
        Assertions.assertEquals(729,myCLASS.sixthpower(3));
    }
    @Test
    void printitself() {
        Assertions.assertEquals(3,myCLASS.printitself(3));
    }
}