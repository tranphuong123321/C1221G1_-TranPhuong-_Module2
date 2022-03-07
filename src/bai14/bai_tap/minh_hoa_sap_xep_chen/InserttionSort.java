package bai_14.bai_tap.minh_hoa_sap_xep_chen;
import java.util.Arrays;
public class InserttionSort {
    public static void sort(int[] array) {
        for(int i=1;i<array.length;i++){
            int currentelement = array[i];
            int k=i-1;
            for(;k>=0 && array [k]>currentelement;k--){
                array[k+1]=array[k];
            }
            array[k+1]=currentelement;
        }
    }

    public static void main(String[] args) {
        int[] myArray={2,9,5,4,8,1};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
