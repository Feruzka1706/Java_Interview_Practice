package a_practice;

import java.util.Arrays;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("isArmstrong() = " + isArmstrong(371));
        //System.out.println(isArmstrong2(1234));
    }

    /**
     * 153 = (1*1*1)+(5*5*5)+(3*3*3)
     * 400= (4*4*4) +(
     * where:
     * (1*1*1)=1
     * (5*5*5)=125
     * (3*3*3)=27
     * So:
     * 1+125+27=153
     */

    public static boolean isArmstrong(int num){
        int sum=0;

        if(num<1){
            return false;
        }

        String str= Integer.toString(num); //"1 53"
       int[] arrayNums= new int[str.length()]; //
       int index=0;
        for (int i = 0; i <str.length(); i++) {
            arrayNums[index++]=str.charAt(i) -'0';
        }

        //int[]=153
        for (int i = 0; i < arrayNums.length; i++) {
            sum+= (arrayNums[i] * arrayNums[i] * arrayNums[i]);
        }

        System.out.println("sum = " + sum);

        if(num==sum){
            return true;
        }

        return false;
    }


    public static boolean isArmstrong2(int num){




        return false;
    }
}
