package practice1;

public class FindMin_Array {

    public static void main(String[] args) {
        int[] arr={1,230,2,30,-1,-300};
        System.out.println("minNum(arr) = " + minNum(arr));
    }

    //write a program that finds min element of given array
    //the array can be String or int but the approach will same
    public static int minNum(int[] array){ //20,10,400,-1
        int minNum=array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i]<minNum){
                minNum=array[i];
            }
        }

        return minNum;
    }
}
