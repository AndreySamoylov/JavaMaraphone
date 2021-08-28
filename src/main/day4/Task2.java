package main.day4;
//2. Создать новый массив размера 100 и заполнить его случайными числами из
//        диапазона от 0 до 10000.
//        Затем, используя циклы for each вывести:
//        - наибольший элемент массива
//        - наименьший элемент массива
//        - количество элементов массива, оканчивающихся на 0
//        - сумму элементов массива, оканчивающихся на 0
//        Использовать сортировку запрещено.
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        int max = 0;//наибольший элемент массива
        int min = 10001;//наименьший элемент массива
        int endZero = 0;//количество элементов массива, оканчивающихся на 0
        int sumEndZero = 0; //сумму элементов массива, оканчивающихся на 0
        //for each
        for (int element : array){
            if(element > max)
                max = element;
            if (element < min){
                min = element;
            }
            if (element % 10 == 0){
                endZero ++;
                sumEndZero += element;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + endZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumEndZero);
    }
}
