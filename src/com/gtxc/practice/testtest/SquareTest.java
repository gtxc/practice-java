package com.gtxc.practice.testtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
    Created by gt at 8:46 AM on Monday, April 11, 2022.
    Project: practice, Package: com.gtxc.practice.testtest.
*/

class SquareTest {

    @Test
    void shouldHaveFourCorners() {
        Shape square = new Square();

        int numberOfCorners = square.getNumberOfCorners();

        Assertions.assertEquals(4, numberOfCorners);
    }
}