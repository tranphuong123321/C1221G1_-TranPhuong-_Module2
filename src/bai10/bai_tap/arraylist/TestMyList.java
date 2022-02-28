package bai_10.bai_tap.arraylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> a = new MyList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(4);

        System.out.println(a.clone());
    }
}
