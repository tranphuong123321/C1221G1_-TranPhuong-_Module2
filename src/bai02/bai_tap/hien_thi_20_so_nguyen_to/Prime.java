package bai_2_vong_lap_trong_java.bai_tap.hien_thi_20_so_nguyen_to;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int status = 1;
        int num = 3;
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        int n = new Scanner(System.in).nextInt();
        if (n == 1) {
            System.out.println(n+" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=n ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if ( num%j == 0 ){
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}
