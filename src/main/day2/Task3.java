package main.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); int b = scan.nextInt();

        if (a < b) {
            int i = a;
            while (i < b) {
                i++;
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.print("Некорректный ввод");
        }
    }
}
