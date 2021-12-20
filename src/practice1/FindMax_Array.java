package practice1;

import java.util.Arrays;

public class FindMax_Array {

    public static void main(String[] args) {

        int[] array={11,2,334,21,-5,20,11,22334};
        System.out.println("maxElement(array) = " + maxElement(array));
        System.out.println("maxNum2(array) = " + maxNum2(array));
    }

    public static int maxElement(int[] arr){



        int maxNum=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
        }

        return maxNum;
    }


    //solution2
    public static int maxNum2(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }
}
