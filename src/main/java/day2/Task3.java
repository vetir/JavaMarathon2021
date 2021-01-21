package day2;

import java.util.Scanner;

public class Task3 {
//    3. Реализовать программу №2, используя цикл while.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (b - a <= 0) {
                System.out.println("Некорректный ввод");
            } else {
                while (a < b) {
                    a++;
                    if (a % 5 == 0 && a % 10 != 0) {
                        System.out.print(a + " ");
                    }
                }
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
