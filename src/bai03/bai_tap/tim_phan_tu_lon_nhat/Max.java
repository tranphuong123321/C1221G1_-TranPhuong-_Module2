package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.tim_phan_tu_lon_nhat;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();
        int arrays[][] = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arrays[" + i + "]["+ j + "] = ");
                arrays[i][j] = scanner.nextInt();
            }
        }
        int max = arrays[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arrays[i][j]) {
                    max = arrays[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}

