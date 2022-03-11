package bai19.bai_tap.validate_so_dien_thoai;

public class RunTest {
    public static void main(String[] args) {
        String regex="^[0-9]{2}\\-[0]\\d{9}$";
        String numberPhone1= "84-0978489648";
        String numberPhone2= "a8)-22222222";
        boolean check1=numberPhone1.matches(regex);
        boolean check2=numberPhone2.matches(regex);
        System.out.println(check1);
        System.out.println(check2);
    }
}
