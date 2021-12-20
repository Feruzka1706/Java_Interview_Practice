package practice1;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        System.out.println(Arrays.toString( reversedArray(arr) ) );
    }

    public static int[] reversedArray(int[] arr){
        int[] reversed = new int[arr.length];
       int index =0;
        for (int i = arr.length-1; i >=0 ; i--) {

            reversed[index++] = arr[i] ;
        }

        return reversed;
    }

}
