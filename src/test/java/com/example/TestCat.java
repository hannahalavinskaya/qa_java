package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    Feline feline;
    Cat cat;

    @Mock
    Cat catmock;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFoodCalled() throws Exception {
        catmock.getFood();
        Mockito.verify(catmock).getFood();
    }

    @Test
    public void testGetFood() throws Exception {  // проверка на то, что метод возвращает соответствующий хищнику список еды
        assertEquals("inappropriate food list for predator", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
