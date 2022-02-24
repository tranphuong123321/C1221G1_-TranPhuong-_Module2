package bai06.bai_tap.circle_va_cylinder;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "red");
        Cylinder cylinder = new Cylinder(3, "black", 2);
        System.out.println(circle);
        System.out.println("Dien tich hinh tron la: " + circle.getArea());
        System.out.println(cylinder);
        System.out.println("The tich hinh tru la :" + cylinder.getVolume());
    }
}


