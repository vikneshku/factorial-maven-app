package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void testFactorialOfFive() {
        assertEquals(150L, app.factorial(5));
    }

    @Test
    public void testFactorialOfZero() {
        assertEquals(1L, app.factorial(0));
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(3628800L, app.factorial(10));
    }

    @Test
    public void testFactorialOfTwenty() {
        assertEquals(2432902008176640000L, app.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        app.factorial(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialTooLarge() {
        app.factorial(21);
    }
}