package practice1;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr={0,2,0,2,3,45,0,26};
        System.out.println(Arrays.toString(moveAllZeros(arr) ) );

    }
    //write a program that can moves all zeros to the end in the given array
    // int[] arr={0,2,0,2,3,45,0,26};
    public static int[] moveAllZeros(int[] arr){

        //Arrays.sort(arr);
        int[] result=new int[arr.length];
        int index=0;

        for (int i = 0; i < arr.length; i++) {

            if( arr[i] !=0 ){
                result[index++]=arr[i];
            }

        }

        return result;
    }
}
