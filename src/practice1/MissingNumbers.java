package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers {

    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(Arrays.asList(1,3,4,5,6,7));
        System.out.println("findMissingNum(list) = " + findMissingNum(list));
    }

    public static int findMissingNum(List<Integer> list) {
        //first thing we need to calculate all sum of numbers inside list
        int sumOfNums = 0;

        for (int eachNum : list) {
            sumOfNums += eachNum;
        }

        int num = list.size() + 1; //7

        int actualSum = (num * (num + 1) ) / 2; //28
        System.out.println("actualSum = " + actualSum);

        return actualSum - sumOfNums;
    }

}