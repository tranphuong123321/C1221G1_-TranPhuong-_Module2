package bai06.bai_tap.circle_va_cylinder;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        boolean check = true;
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("1.Tinh dien tich hinh tron");
            System.out.println("2.Tinh the tich hinh tru");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("dien tich hinh tron la: " + circle.getArea());
                    break;
                case 2:
                    System.out.println("the tich hinh tru la: " + cylinder.getVolume());
                    break;
            }
        }
    }
}
