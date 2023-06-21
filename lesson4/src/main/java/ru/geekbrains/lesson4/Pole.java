package ru.geekbrains.lesson4;

public abstract class Pole {

    protected  int razmer;

    public Pole(int razmer) {
        this.razmer = razmer;
    }
    abstract void run(int razmer) throws MyArraySizeException;
}