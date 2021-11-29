package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    private Feline feline; //объявили локальную переменную, чтобы не создавать объект внутри другого объекта

    public Lion(Feline feline, String sex) throws Exception { //создали конструктор с двумя параметрами
        this.feline = feline; // устанавливаем значение локальной переменной с переданными параметрами
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() { //методы объекта, сколько котят
        return feline.getKittens();
    }

    public boolean doesHaveMane() { //метод объекта, есть ли грива
        return hasMane;
    }

    public List<String> getFood() throws Exception { // вызывается метод класса хищник, который возвращает список еды класса Animal
        return feline.getFood("Хищник");
    }
}
