package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeClassTest {
    @Test
    public void testSum() {
        var expected = 5;
        var actual = SomeClass.sum(3, 2);
        assertEquals(expected, actual);
    }
}
