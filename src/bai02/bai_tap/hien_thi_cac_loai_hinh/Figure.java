package bai_2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("botton-left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("top-left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("top-right");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= 1; j--) {
                        if (j <= (5 - i)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                }
                break;
            case 3:
                for (int i=1;i<=5;i++){
                    for (int j=0;j<=5-i;j++){
                        System.out.print(" ");
                    }
                    for (int k=0;k<i*2-1;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");

        }
    }
}
