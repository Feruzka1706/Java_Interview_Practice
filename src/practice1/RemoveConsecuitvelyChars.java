package practice1;

public class RemoveConsecuitvelyChars {

    public static void main(String[] args) {

        String str="aabbbcabcbb"; //cabc //1112134566788599 >>> 2134575

        String result="";

        for (int i = 0; i < str.length()-1; i++) {

            if(str.charAt(i)!=str.charAt(i+1) && str.charAt(i)!=str.charAt(i-1) ){

                result+=str.charAt(i);
            }

        }

        System.out.println("result = " + result);

    }



}
