package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice2Class {

    public static void main(String[] args) {


        int[] arr1={5, 5, 3, 9, 2};   //[9,1]  [5,2]  [5,3]  [3,6]  [2,7] ==9+5+5+6+7=32
        int[] arr2={3, 6, 7, 2, 1};

        /**
         * On the below I used another diff two arrays which can check
         * the code is exactly working or not
         */
//          int[] arr1={7,4,2,15,1}; // >> [15,1]  [7,3]  [4,7]  [2,9]  [1,27] ==15+7+7+9+27=65
//          int[] arr2={27,9,3,7,1};

        Arrays.sort(arr1); //2,3,5,5,9     //7+6+5+5+9= 32
        Arrays.sort(arr2); //1,2,3,6,7

        int[] descendingArr= new int[arr1.length];
         int index=0;
        for (int i = arr1.length-1; i>=0; i--) {

            descendingArr[index++]=arr1[i]; //9,5,5,3,2
        }
        System.out.println(Arrays.toString(descendingArr));

        // arr1== 9,5,5,3,2
        // arr2== 1,2,3,6,7
        int sumOfSpeed=0;
        for (int i = 0, j=0; i <descendingArr.length; i++, j++) {

            if(descendingArr[i]>arr2[j]){
                sumOfSpeed+=descendingArr[i];
            }
            //Here I just basically added one more condition, so it checks each element of both array
            //each time when looping and getting only max elements and
            //will assign to sumOfSpeed >> which will return 32 in our case
            if(arr2[j]>descendingArr[i]){
                sumOfSpeed+=arr2[j];
            }
        }

        System.out.println("sumOfSpeed = " + sumOfSpeed);


    }


/**
 * redShirtSpeeds = [5, 5, 3, 9, 2]  int= 9,5,5,3,2
 * blueShirtSpeeds = [3, 6, 7, 2, 1] int= 1,2,3,6,7
 * redShirtSpeeds = [5,5]
 * blueShirtSpeeds = [5,5]
 *
 * [9,1] [7,2]  = 9 + 7 = 16
 * [5,2] [6,3] = 5 + 6 =11
 * [5,3]= 5  =32
 * fastest = true
 */


}
