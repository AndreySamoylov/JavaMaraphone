package main.day6;


//В классах Автомобиль и Мотоцикл реализовать два метода:
//        info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//        yearDifference() - принимает на вход число (год), и возвращает разницу между
//        переданным годом и годом выпуска транспортного средства
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1990);
        car.setColor("black");
        car.setModel("audi");

        Motorbike motorbike = new Motorbike(1945,"yellow","raw");

        car.Info(); motorbike.Info();

        System.out.println(car.yearDifference(2000));
        System.out.println(motorbike.yearDifference(1667));
    }
}
