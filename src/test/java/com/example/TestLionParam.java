package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionParam {

    Lion lion;
    Feline feline;

    private final String sex;
    private final Boolean expected;

    public TestLionParam(String sex, Boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void testCreateLion() throws Exception { // проверка создания льва в кострукторе в зависимости от переданного параметра sex
        Lion lionMale = new Lion(feline, sex);
        assertEquals("HaveMane", expected, lionMale.doesHaveMane());
    }
}
