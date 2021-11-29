package com.example;

import java.util.List;

public class Cat {

    Predator predator; //объявили локальную переменную

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
