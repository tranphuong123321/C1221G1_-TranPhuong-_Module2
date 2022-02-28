package bai_10.thuc_hanh.list_don_gian;
import java.util.Scanner;
public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(5);


        myList.add(0,10);
        myList.add(1,20);
        myList.add(2,30);
        myList.add(3,40);
        myList.add(4,50);

        System.out.println("The length of array is " + myList.getLength());
        System.out.println("The size of array is " + myList.size());
        System.out.println("Before: ");


        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }

        //Method remove()
        System.out.println("\nAfter: ");

        myList.remove(2);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }

        System.out.println("\nThe size of array is " + myList.size());

        //Method ensureCapacity()
        myList.add(4,60);
        myList.add(5,70);

        System.out.println("\nThe length of array is " + myList.getLength());
        System.out.println("The size of array is " + myList.size());

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }
        MyList<Integer> newList = myList.clone();

        System.out.println();
        System.out.println(newList);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numContain = scanner.nextInt();

        if (myList.contains(numContain))
            System.out.println("the number " + numContain + " is in the list!");
        else
            System.out.println("the number " + numContain + " is not in the list!");

        //Method indexOf()
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberIndexOf = scanner.nextInt();

        boolean checkNum = myList.indexOf(numberIndexOf) == -1;

        if (checkNum)
            System.out.println("This number is not in the list!");
        else
            System.out.println("The number " + numberIndexOf + " is at index " + myList.indexOf(numberIndexOf));


        //Method add()
        boolean check = myList.add(80);

        if (check)
            System.out.println("the number is added successfully!");
        else
            System.out.println("the number is not added successfully!");

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }

        System.out.println();

        //Method clear()
        myList.clear();
    }
}
