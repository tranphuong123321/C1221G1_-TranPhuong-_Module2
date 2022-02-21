package bai04.bai_tap.phuong_trinh_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so a");
        double a = scanner.nextDouble();
        System.out.println("Hay nhap so b");
        double b = scanner.nextDouble();
        System.out.println("Hay nhap so c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co 2 nghiem la: " + quadraticEquation.getRoot1() + " va " + quadraticEquation.getRoot2());

        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co 1 nghiem la: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
