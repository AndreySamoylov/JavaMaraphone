package main.day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() { return length; }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void Info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int value){
        this.fuel += value;
    }

    public static void  compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength() > airplane2.getLength()){
            System.out.println("Первый самолёт длинее");
        }else  if (airplane1.getLength() < airplane2.getLength()){
            System.out.println("Второй самолёт длинее");
        }else {
            System.out.println("Самолёты равны");
        }
    }
}
