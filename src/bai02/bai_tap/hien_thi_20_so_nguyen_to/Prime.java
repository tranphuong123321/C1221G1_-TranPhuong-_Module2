package bai_2_vong_lap_trong_java.bai_tap.hien_thi_20_so_nguyen_to;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int status = 1;
        int num = 3;
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        int n = new Scanner(System.in).nextInt();

            System.out.println(n+" Số nguyên tố đầu tiên là:");
            System.out.print(2+"\t");

        for ( int i = 2 ; i <=n ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if ( num%j == 0 ){
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ) {
                System.out.print(num+"\t");
                i++;
            }
            status = 1;
            num++;
        }
    }
}
