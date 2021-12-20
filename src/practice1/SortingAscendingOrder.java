package practice1;

import java.util.Arrays;

public class SortingAscendingOrder {

    public static void main(String[] args) {
        int[] arr={3,6,2,1,9};
        System.out.println(Arrays.toString( sortedArray(arr) ));
    }

    //write a program which returns given array as ascending order
    public static int[] sortedArray(int[] arr){//3,6,2,1,9
        //Arrays.sort(arr);
        int[] resultArray= Arrays.copyOfRange(arr,0,arr.length);

        for (int i = 0; i < resultArray.length; i++) {

            for (int j = 0; j < resultArray.length; j++) {

                if(resultArray[i] <resultArray[j]){

                    int temp =resultArray[i];
                    resultArray[i]=resultArray[j];
                    resultArray[j]=temp;
                }

            }

        }

        return resultArray;
    }

}
