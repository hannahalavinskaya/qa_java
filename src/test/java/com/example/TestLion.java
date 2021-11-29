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
public class TestLion {

    Feline feline;

    @Mock
    Lion lion;


    @Before
    public void setUp() throws Exception {  // перед каждым тестом создается новый объект класса Feline
        feline = new Feline();
    }

    @Test (expected = Exception.class) // проверка, что в результате данного теста ожидается Exception
    public void testCreateLionNonBinary() throws Exception {
        Lion lionMale = new Lion(feline, "Небинарный");
    }


    @Test
    public void testGetKittensCalled() { // проверка, что метод вызывается с указанными параметрами
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }

    @Test
    public void testDoesHaveManeCalled() { // проверка, что метод вызывается с указанными параметрами
        lion.doesHaveMane();
        Mockito.verify(lion).doesHaveMane();
    }

    @Test
    public void testGetFoodCalled() throws Exception { // проверка, что метод вызывается с указанными параметрами
        lion.getFood();
        Mockito.verify(lion).getFood();
    }

    @Test
    public void testGetFood() throws Exception {  // проверка на то, что метод возвращает соответствующий хищнику список еды
        Lion lion = new Lion(feline, "Самка");
        assertEquals("HaveMane", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testGetKittens() throws Exception {   //  проверка, что метод возвращает кол-во котят (1)
        Lion lion = new Lion(feline, "Самка");
        assertEquals("Kittens", 1, lion.getKittens());
    }
}