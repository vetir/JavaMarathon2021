package day1;

public class Task1 {
//    1. Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
//    Вывод в консоль должен быть таким:
//    JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print("JAVA ");
            i++;
        }
    }
}
