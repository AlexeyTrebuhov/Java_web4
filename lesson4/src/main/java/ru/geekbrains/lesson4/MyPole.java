package ru.geekbrains.lesson4;

public class MyPole extends Pole{


    public MyPole(int razmer) {
        super(razmer);
    }
    /**
     *
     * @param razmer
     * @throws MyArraySizeException
     */
    @Override
    void run(int distance) throws MyArraySizeException {
        if (razmer == 4){
            return;
        }
        else {
            throw new MyArraySizeException("Указан неправильный размер", razmer);
        }
    }
}
