package main.day9.Task2;

public class Triangle extends Figure{
    private double a, b, c;
    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double half_p =  perimeter() / 2;
        return Math.sqrt(half_p * (half_p - a) * (half_p - b) * (half_p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
