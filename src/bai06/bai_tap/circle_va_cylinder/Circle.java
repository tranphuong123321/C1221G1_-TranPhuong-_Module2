package bai06.bai_tap.circle_va_cylinder;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mau sac");
        String color = scanner.nextLine();
        this.setColor(color);
        System.out.println("nhap ban kinh");
        double radius = Double.parseDouble(scanner.nextLine());
        this.setRadius(radius);
        return radius * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +"Area= "+ getArea() +
                ", radius=" + this.getRadius() +
                ", color='" + this.color + '\'' +
                '}';
    }
}
