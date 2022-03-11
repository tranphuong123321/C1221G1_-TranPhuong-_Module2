package bai19.bai_tap.validate_ten_lop_hoc;

public class RunTest {
    public static void main(String[] args) {
        String regex="^([C]|[A]|[P])[0-9]{4}[G]|[H]|[I]|[K]|[L]|[M]$";
        String className1="C1234G";
        String className2="B1515v";
        boolean check1=className1.matches(regex);
        boolean check2=className2.matches(regex);
        System.out.println(check1);
        System.out.println(check2);
    }
}
