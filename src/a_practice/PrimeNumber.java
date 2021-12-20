package a_practice;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("primeNumber() = " + primeNumber(7));
        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
        // 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
    }


    //write a program that checks if the given number is Prime or not
    //and returns True if the given number is Prime, and returns False if it is not Prime
    public static boolean primeNumber(int number){


        if(number<2){
           return false;
        }

        for (int i = 2; i <number; i++) {

            if(number%i==0){
               return false;
            }
        }

        return true;

    }


}
