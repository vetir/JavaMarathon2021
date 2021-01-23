package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
//    1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
//    указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//    содержимое массива в консоль, а также вывести в консоль информацию о:
//    а) Длине массива
//    б) Количестве чисел больше 8
//    в) Количестве чисел равных 1
//    г) Количестве четных чисел
//    д) Количестве нечетных чисел
//    е) Сумме всех элементов массива
//
//    Пример:
//    Введено число 10. Сгенерирован следующий массив:
//            [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//    Информация о массиве:
//    Длина массива: 10
//    Количество чисел больше 8: 1
//    Количество чисел равных 1: 0
//    Количество четных чисел: 6
//    Количество нечетных чисел: 4
//    Сумма всех элементов массива: 46
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kolelem = scanner.nextInt();
        int[] array = new int[kolelem];
        int moreEight = 0;
        int equalToOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] > 8) {
                moreEight++;
            }
            if (array[i] == 1) {
                equalToOne++;
            }
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum = sum + array[i];
        }

        System.out.println("Введено число " + kolelem + ". " + "Сгенерирован следующий массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalToOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
