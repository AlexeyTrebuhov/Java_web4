package ru.geekbrains.lesson4;

public class MyExeption extends Exception{
    private int razmer;

    public Integer getRazmer() {
        return razmer;
    }
    public MyExeption(String message, int razmer) {
        super(message);
    }
}

