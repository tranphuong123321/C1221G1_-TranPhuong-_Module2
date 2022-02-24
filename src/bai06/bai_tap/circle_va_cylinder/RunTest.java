package bai06.bai_tap.circle_va_cylinder;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        boolean check = true;
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("1.Nhap thong tin cua hinh tron");
            System.out.println("2.Nhap thong tin cua hinh tru");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Thong tin cua hinh tron: " + circle.toString());
                    break;
                case 2:
                    System.out.println("Thong tin cua hinh tru: " + cylinder.toString());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
