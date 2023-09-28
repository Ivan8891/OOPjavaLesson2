package org.example;

public class Human extends Actor {
    Human(String name){
        super.name=name;
    }
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;

    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;

    }

    @Override
    public String toString() {
        return String.format("Имя: " + name +
                "\nЗаказ принят: " + isMakeOrder +
                "\nЗаказ выдан: " + isTakeOrder +
                "\n________________________________");
    }
}
