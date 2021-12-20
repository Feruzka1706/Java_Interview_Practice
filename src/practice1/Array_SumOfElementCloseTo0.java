package practice1;

import  java.util.List;
import  java.util.ArrayList;


public class Array_SumOfElementCloseTo0 {

    public static void main(String[] args) {
        int[] array={1,3,47,29,-4,23,-3,0};
        System.out.println("getSumOfTwoClosestToZeroElements(array) = " + getSumOfTwoClosestToZeroElements(array));
    }

    //write a program that returns sum of the two elements closest to ZERO
    public static int getSumOfTwoClosestToZeroElements(int[] array){ //1,3,47,29,-4,23,-3,0
        //declare List to collect those elements which are close to 0
        List<Integer> list =new ArrayList<>();
        int tempValue=0;

        for (int i = 0; i <array.length; i++) {

            for (int j = i+1; j < array.length ; j++) {


                int sum = array[i] + array[j];

                if (tempValue == 0) {
                    tempValue = sum;

                    if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(tempValue)) {
                        tempValue = sum;
                        list.add(array[i]);
                        list.add(array[j] );
                    }
                }

            }
        }

        System.out.println("list = " + list);

        return tempValue;
    }



}
