package main.day12;

import java.util.ArrayList;
import java.util.List;

/*1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
        консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
        из списка. Распечатать список.*/
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i ++){
            list.add("Машина №" + (i+1));
        }

        System.out.println(list);

        list.add(2,"Машина 2.5");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
