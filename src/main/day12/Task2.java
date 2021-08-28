package main.day12;

import java.util.ArrayList;
import java.util.List;

/*2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
        Вывести список.*/
public class Task2 {
    public static void main(String[] args) {
        List <int> list = new ArrayList<>();

        for (int i = 0 ; i < 31; i++){
            list.add(i);
        }
        for (int i = 300 ; i < 351; i++){
            list.add(i);
        }

        System.out.println(list);
    }
}
