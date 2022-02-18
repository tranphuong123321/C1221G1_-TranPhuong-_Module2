package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Scanner;

public class Array {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int arr [] = new int[5];
        int arr1[] = new int[7];
        int arr2[] = new int[arr.length + arr1.length];
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Input arr["+i+"]");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("Input arr["+i+"]");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i] );
        }
        int j = 0;
        for(int element : arr){
            arr2[j] = element;
            j++;
        }
        for(int element : arr1){
            arr2[j] = element;
            j++;
        }
        for (int i = 0 ; i < arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }
}

