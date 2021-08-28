package main.day4;
//Задачи:
//        1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
//        указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//        содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        Random random = new Random();
        int [] array = new  int[arrayLength];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        int upperEight = 0;//Количество чисел больше 8
        int equalOne = 0;// Количестве чисел равных 1
        int evenCount = 0;//Количестве четных чисел
        int sum = 0;//Сумме всех элементов массива
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 8)
                upperEight += 1;
            if (array[i] == 1)
                equalOne += 1;
            if (array[i] % 2 == 0)
                evenCount++;
        }
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + upperEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + (array.length - evenCount));
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
