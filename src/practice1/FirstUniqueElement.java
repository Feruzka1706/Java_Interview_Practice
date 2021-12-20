package practice1;

public class FirstUniqueElement {

    public static void main(String[] args) {
        String[] arr={"Feruza","feruza","Maftuna","Zulhumor","Maftuna","Komil"};

        System.out.println("firstDuplicatedElement(arr) = " + firstDuplicatedElement(arr));

        String word="aawbcnsjjlll";
        System.out.println("firstDupChar(word) = " + firstDupChar(word));

        int[] array={1,2,3,4,1,2,3,5,7};
        System.out.println("firstDupElement(array) = " + firstDupElement(array));

    }

    //Write a program that can find first duplicated element from the array
    public static String firstDuplicatedElement(String[] arr){
        String firstDupString="";

        for (String eachWord : arr) {
          int frequency=0;
            for (String eachWord2 : arr) {

                if(eachWord.equalsIgnoreCase(eachWord2)){
                    frequency++;
                }
            }

            if(frequency>1){
                firstDupString=eachWord;
                break;
            }

        }

        return firstDupString;
    }


    //solution2
    public static char firstDupChar(String word){
        char firstDupChar=0;

        for (int i = 0; i < word.length(); i++) {

            int frequency=0;

            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                    frequency++;
                }
            }

            if(frequency>1){
                firstDupChar=word.charAt(i);
                break;
            }

        }

        return firstDupChar;
    }

    //solution3
    public static int firstDupElement(int[] arr){
        int firstDupElement=0;

        for (int i = 0; i < arr.length; i++) {
            int frequency=0;

            for (int j = 0; j < arr.length; j++) {

                if(arr[i]==arr[j]){
                    frequency++;
                }
            }

            if(frequency>1){
                firstDupElement=arr[i];
                break;
            }
        }

        return firstDupElement;
    }


}
