package com.gtxc.practice.testtest;

/*
    Created by gt at 8:29 AM on Monday, April 11, 2022.
    Project: practice, Package: com.gtxc.practice.testtest.
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircleTest {

    Shape circle;

    @BeforeEach
    void setup() {
        circle = new Circle();
    }

    @Test
    void shouldHaveNoCorners() {
        Assertions.assertEquals(0, circle.getNumberOfCorners());
    }

    @Test
    @DisplayName("Some name")
    void anotherTestCase() {
        Assertions.assertEquals(0, 1);
    }
}