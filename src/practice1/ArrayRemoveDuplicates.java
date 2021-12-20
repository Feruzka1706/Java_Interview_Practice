package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRemoveDuplicates {

    public static void main(String[] args) {
        int[] arr={1,1,3,5,6,3,7,22,90,22};
        System.out.println(Arrays.toString( removeDupElement(arr) ));
    }

    //write a program that removes duplicate elements of given array
    public static int[] removeDupElement(int[] array){

        List<Integer> list=new ArrayList<>();

        for(int eachElement: array){
            if(!list.contains(eachElement)){
                list.add(eachElement);
            }
        }

        int[] resultArray = new int[list.size()];
        int index=0;
        for (int eachUniqueElement : list){
            resultArray[index++]=eachUniqueElement;
        }

        return resultArray;
    }
}
