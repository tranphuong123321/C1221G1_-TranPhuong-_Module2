package bai_2_vong_lap_trong_java.thuc_hanh.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int num = new Scanner(System.in).nextInt();
        if (num < 2) {
            System.out.println(num + "is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " is no a prime");
            }
        }
    }
}
