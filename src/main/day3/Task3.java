package main.day3;

import java.util.Scanner;
//3. Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
//        делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
//        и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
//        того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
//        выводим в консоль сообщение “Деление на 0”.
//        Ключевое слово else использовать в этой программе нельзя.
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            double a = scan.nextDouble(), b = scan.nextDouble();
            if (b == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
