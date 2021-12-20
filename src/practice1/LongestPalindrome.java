package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPalindrome {

    public static void main(String[] args) {
        //List<String> list=new ArrayList<>();
       // list.addAll(Arrays.asList("Anna","mom","level","Java","Selenium"));
        System.out.println("longestPalindrome(list) = " + longestPalindrome("Feruza"));
    }



    //write a program that finds the longest Palindrome in given string
    public static String longestPalindrome(String str){
        String longestPalindrome="";
        List<String> list=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {

            for (int j = i+1; j < str.length(); j++) {
                list.add(str.substring(i,j) );
            }
        }

        for (String eachElement : list) {
            String reversed="";

            for (int i =eachElement.length()-1 ; i >=0 ; i--) {

                reversed+=eachElement.charAt(i);
            }


            if(eachElement.equalsIgnoreCase(reversed) && eachElement.length()>longestPalindrome.length()){
                longestPalindrome=eachElement;
            }



        }

        System.out.println("list = " + list);

        return longestPalindrome;
    }


}
