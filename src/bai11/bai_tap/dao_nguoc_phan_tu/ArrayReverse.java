package bai_11.bai_tap.dao_nguoc_phan_tu;
import java.util.Stack;
public class ArrayReverse {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Integer[] integer = new Integer[3];
        integer[0] = myStack.push(1);
        integer[1] = myStack.push(2);
        integer[2] = myStack.push(3);

        for (Integer integers :integer){
            System.out.print(integers+" ");
        }
        System.out.println();
        integer[0] = myStack.pop();
        integer[2] = myStack.push(1);

        for (Integer integers :integer){
            System.out.print(integers+" ");
        }
    }
}
