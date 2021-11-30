package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;

    @Test (expected = Exception.class) // проверка, что в результате данного теста ожидается Exception
    public void testCreateLionNonBinary() throws Exception {
        Lion lion = new Lion(feline, "Небинарный");
    }

    @Test
    public void testGetKittens() throws Exception { //  проверка на то, что при вызове метода lion.getKittens вызывается feline.getKittens без параметра
        Lion lion = new Lion(feline, "Самка");
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {  // проверка на то, что при вызове метода lion.getFood вызывается feline.getFood с параметром "Хищник"
        Lion lion = new Lion(feline, "Самка");
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

}