package bai06.bai_tap.circle_va_cylinder;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mau sac");
        String color=scanner.nextLine();
        this.setColor(color);
        System.out.println("nhap ban kinh");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap chieu cao");
        double height=Double.parseDouble(scanner.nextLine());
        this.setHeight(height);
        return radius * radius * 3.14*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +"Volume="+getVolume()+","+
                "height=" + height +","+
                "color=" + this.getColor() + '\'' +
                '}';
    }
}
