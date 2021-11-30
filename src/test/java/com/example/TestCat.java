package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Mock
    Feline feline;

    Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat(feline);
    }

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception { // проверка на то, что при вызове метода cat.getFood вызывается feline.eatMeat
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

}
