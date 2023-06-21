/* Задача 1:
1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.
*/

package ru.geekbrains.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        StringBuilder s = new StringBuilder();
        int sum = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the string array");
        int razmer = in.nextInt();
        String[][] arr = new String[razmer][razmer];
        Random r = new Random();


        if (razmer != 4) {
            throw new MyArraySizeException("Didn't guess. Size should only be 4", razmer);
        }

        for (int i = 0; i < razmer; i++) {   // заполниям массив символами
            for (int j = 0; j < razmer; j++) {
                StringBuilder builder = new StringBuilder();
                char code = (char) (r.nextInt(60));
                builder.append(Character.toString(code));
                arr[i][j] = builder.toString();
                System.out.println(arr[i][j]);
            }
        }

        for (int i = 0; i < razmer; i++) {
            for (int j = 0; j < razmer; j++) {
                String z = arr[i][j];

                try {
                    Integer.parseInt(z);
                    sum = sum + Integer.parseInt( z);
                } catch (Exception e) {                 // С этим исключением все работает
                    //} catch (MyArrayDataException) {          //  А с этим пишет ошибку
                    s = new StringBuilder(s + "Count string " + count + " : i=" + i + "  j=" + j + " * ");
                    count = count + 1;

                }
            }
        }
        System.out.println("Drill down on cells with invalid data : " + s);
        System.out.println("The sum of all numbers in the matrix = " + sum);
    }
}
