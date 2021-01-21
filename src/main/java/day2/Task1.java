package day2;

import java.util.Scanner;

public class Task1 {
//    1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
//    число, соответствующее количеству этажей в здании. Используя условный оператор if, необходимо
//    вывести в консоль сообщение о типе такого дома.
//    Условия:
//    если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
//    Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {

            int number = scanner.nextInt();

            if (number >= 1 && number <= 4) {
                System.out.println("Малоэтажный дом");
            }

            if (number >= 5 && number <= 8) {
                System.out.println("Среднеэтажный дом");
            }

            if (number >= 9) {
                System.out.println("Многоэтажный дом");
            }

            if (number <=0) {
                System.out.println("Ошибка ввода");
            }

        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
