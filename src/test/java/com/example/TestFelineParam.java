package com.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFelineParam {

    Feline feline;

    private final int actual;
    private final int expected;

    public TestFelineParam(int actual, int expected) {  // конструктор с параметрами
        this.actual = actual;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getParams() {  // метод для получения данных
        return new Object[][] {
                { 3, 3},
                { 0, 0},
        };
    }

    @Test
    public void testGetKittensWithParam() {
        assertEquals("Kittens", expected, feline.getKittens(actual));
    }

}
