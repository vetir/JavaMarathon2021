package day4;

import java.util.Arrays;

public class Task4 {
//    4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной
//    суммой выведите значение суммы и индекс первого элемента тройки.
//    Пример:
//            *Для простоты пример показан на массиве размера 10
//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//    Тройка с максимальной суммой: [8742, 1040, 3254]
//    Вывод в консоль:
//            13036
//            7
//            *Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс
//    первого элемента тройки, то есть индекс числа 8742.

    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;
        int sumMax = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 2; i++) {
            sum = array[i] + array[i+1] + array[i+2];
            if (sum < sumMax) {
                sum = sumMax;
                maxIndex = i;
            }
        }
        System.out.println(sum);
        System.out.println(maxIndex);
    }
}
