package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override // переписали метод имплемент. интерфейса Predator
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override  // переписали метод родительского класса Animal
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {  //добавили своих методов, метод с дефолтным значением
        return getKittens(1);
    }

    public int getKittens(int kittensCount) { //добавили своих методов, метод с параметром
        return kittensCount;
    }
}
