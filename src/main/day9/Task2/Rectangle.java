package main.day9.Task2;

public class Rectangle extends Figure{
    private double height;
    private double width;

    public Rectangle(String color,double width ,double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return height + height + width + width;
    }
}
