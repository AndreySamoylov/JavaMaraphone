package main.day5;
//1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
//        Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//        задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//        Созданный вами класс должен отвечать принципам инкапсуляции.
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(1998);
        car.setColor("Белый");
        car.setModel("Ласточка");

        System.out.println("Car: "+ car.getYear()+ " " + car.getColor()+ " " + car.getModel());
    }
}
