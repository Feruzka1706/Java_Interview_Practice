package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {

    public static void main(String[] args) {
        Integer[] arr1={12,3,3,41,2};
        Integer[] arr2={27,5,1,90,-45};

        System.out.println("mergingArrays(arr1,arr2) = " +Arrays.toString( mergingArrays(arr1,arr2) ) );

        //arr[0][0]
        int[][] twoDimensional1={{10,100},{30,50}}; //10,20,15,40,30,5,50,10
        int[][] twoDimensional2={{20,40},{5,60}};

       // System.out.println("twoDimensional1[0][0] = " + twoDimensional1[0][0]);
        List<Integer> list=new ArrayList<>();
//        int result=0;
//        for(int[] eachArray :twoDimensional1){
//
//            for(int eachElement :eachArray){
//
//                if(eachElement>result){
//                    list.add(eachElement);
//                }
//                result=eachElement;
//            }
//
//        }

        int result1=0;
        for (int i = 0; i < twoDimensional1.length;  i++) {

            for (int j = i+1; j <=i; j++) {

                if(twoDimensional1[i][j]>result1 ){
                    list.add(twoDimensional1[i][j]);
                } result1=twoDimensional1[i][j];

                if(twoDimensional2[i][j]>result1){
                    list.add(twoDimensional2[i][j]);
                } result1=twoDimensional2[i][j];

            }

        }

        System.out.println("list = " + list);

    }

//write a program that merges two arrays
    public static int[] mergingArrays(Integer[] arr1, Integer[] arr2){

        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        System.out.println("list = " + list);


        int[] resultArray=new int[arr1.length+ arr2.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            resultArray[j++]= arr1[i];
            //resultArray[j++]=arr2[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            resultArray[j++]=arr2[i];
        }

        return resultArray;

    }



}
