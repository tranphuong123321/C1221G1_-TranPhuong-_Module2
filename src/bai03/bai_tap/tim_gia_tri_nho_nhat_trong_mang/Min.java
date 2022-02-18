package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class Min {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập chiều dài mảng: ");
        n = scanner.nextInt();
        int arr []  = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhập phần tử tại arr["+i+"]");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        int min = arr[0];
        for (int i = 0 ; i<n ; i++ ){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " +min);
    }
}

