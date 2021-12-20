package a_practice;

public class ConsecutivelyNumbers {

    public static void main(String[] args) {
        consecutivityNum(24);
    }

    //write a program which checks given positive N number inside each number is divisible
    //by specific condition and based that condition return Codility Test Coder or in
    //some cases together

    public static void consecutivityNum(int num){
        String msg="";

        if(num<=0){
            msg="Invalid number";
        }else {
            for (int i = 1; i <=num; i++) {

                if(i % 30 == 0){
                    msg+="CodilityTestCoder\n";
                }else if(i % 10 ==0){
                    msg+="CodilityCoder\n";
                }else if(i % 6 ==0){
                    msg+="CodilityTest\n";
                }else if(i % 2==0){
                    msg+="Codility\n";
                }else if(i % 3==0){
                    msg+="Test\n";
                }else if(i % 5==0){
                    msg+="Coder\n";
                }else {
                    msg+=i+" \n";
                }
            }
        }


        System.out.println("msg = " + msg);
    }




}
