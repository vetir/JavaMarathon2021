package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
//    2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//    Затем, используя циклы for each вывести в консоль:
//    наибольший элемент массива
//    наименьший элемент массива
//    количество элементов массива, оканчивающихся на 0
//    сумму элементов массива, оканчивающихся на 0
//
//    Использовать сортировку запрещено.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int max = 0;
        int min = 100000;
        int naNool = 0;
        int sumNaNool = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }
            System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] % 10 == 0){
                naNool++;
                sumNaNool += array[i];
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + naNool);
        System.out.println("суммa элементов массива, оканчивающихся на 0: " + sumNaNool);
    }

}
