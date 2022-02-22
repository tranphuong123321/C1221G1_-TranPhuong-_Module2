package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.tinh_tong_trong_cot;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột");
        int col = Integer.parseInt(sc.nextLine());
        double[][] array = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập giá trị phần tử tại vị trí hàng số :"+i+" cột số :"+j);
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Nhập cột muốn tính tổng");
        int input = Integer.parseInt(sc.nextLine());
        double sum = 0.0d;
        for(int i = 0; i<array.length;i++){
            sum+=array[i][input];
        }

        System.out.println("Tổng giá trị của mảng tại cột "+ input + " là "+ sum);
    }
}

