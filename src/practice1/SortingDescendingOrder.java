package practice1;

import java.util.Arrays;

public class SortingDescendingOrder {

    public static void main(String[] args) {

        int[] array ={1,3,26,4,2,38,9,5,45};
        System.out.println(Arrays.toString(sortingDescending(array) ) );

    }


    //write a program that returns given array as descending format
    public static int[] sortingDescending(int[] arr){

        int[] resultArray= Arrays.copyOfRange(arr,0,arr.length) ;

        for (int i = 0; i < resultArray.length; i++) {

            for (int j = 0; j < resultArray.length; j++) {

                if(resultArray[i]>resultArray[j]){
                    int tempValue=resultArray[i];
                    resultArray[i]=resultArray[j];
                    resultArray[j]=tempValue;
                }

            }

        }

        return resultArray;
    }
}
