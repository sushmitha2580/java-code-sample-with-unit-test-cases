package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGetGreeting() {
        App app = new App();
        assertEquals("Hello, World!", app.getGreeting());
    }

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(8, app.add(5, 3));
        assertEquals(0, app.add(-1, 1));
        assertEquals(-4, app.add(-2, -2));
    }

    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(2, app.subtract(5, 3));
        assertEquals(-2, app.subtract(-1, 1));
        assertEquals(0, app.subtract(-2, -2));
    }

    @Test
    public void testIsEven() {
        App app = new App();
        assertTrue(app.isEven(4));
        assertFalse(app.isEven(5));
        assertTrue(app.isEven(0));
        assertTrue(app.isEven(-2));
    }
}
