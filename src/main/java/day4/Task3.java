package day4;

public class Task3 {
//    3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
//    матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
//    В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк
//    несколько, вывести индекс последней из них.
//    Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//            3 2 1 5 7 	// сумма - 18
//            1 2 5 6 2 	// сумма - 16
//            3 4 9 6 4	// сумма - 26
//
//    Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
    public static void main(String[] args) {
        int[][] array = new int[8][12];
        int sumStroki = 0;
        int sumMax = 0;
        int sumMaxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51);
                sumStroki += array[i][j];
            }
            if (sumStroki > sumMax) {
                sumMax = sumStroki;
                sumMaxIndex = i;
            }
                sumStroki = 0;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Максимальная сумма строки равна: " + sumMax);
        System.out.println("Индекс у этой строки: " + sumMaxIndex);

    }
}
