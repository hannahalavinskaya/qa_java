package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Mock
    Feline felinemock;

    Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        assertEquals("HaveMane", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {   //  проверка, что метод возвращает кол-во котят (1)
        assertEquals("Kittens", 1, feline.getKittens());
    }

    @Test
    public void testGetKittensCalled() { // проверка, что метод вызывается с указанными параметрами
        felinemock.getKittens();
        Mockito.verify(felinemock).getKittens();
    }

}