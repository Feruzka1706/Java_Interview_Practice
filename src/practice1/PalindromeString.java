package practice1;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println("isPalindrome(\"Java\") = " + isPalindrome("Level"));
    }

    public static boolean isPalindrome(String word){
        String reversed="";

        for (int i = word.length()-1; i >= 0; i--) {

          reversed += word.charAt(i);
        }

        return word.equalsIgnoreCase(reversed);
    }
}
