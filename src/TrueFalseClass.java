import java.util.Scanner;

public class TrueFalseClass {
    //11/07/2020
    //1.Given two numbers,return true if the sum of both numbers is less than 100.otherwise return false.
    // return type with parameter
    public static boolean lessThanHundred(int a, int b) {

        boolean result1 = a + b < 100;
        return result1;
    }

    //2.create a function that returns true if an integer is evenly divisible by 5,and false otherwise
    //no return type with parameter
    public static void divisibleByFive(int x) {

        Scanner scanner = new Scanner(System.in);
        //Entering an Integer is evenly divisible by 5 or not

        if (x % 5 == 0) {
            System.out.println("Given Number is divisible by 5 is = true");
        } else {
            System.out.println("Given Number is  not divisible by 5 is = false");
        }

    }

    //return type with parameter
    //3.Entering an Integer and terurns true if it's divisible by 100 or not.
    public boolean divisibleByHundred(int c) {

        boolean result3 = c % 100 == 0;
        return result3;
    }

    //return type with parameter
    /*7.create a function that takes in three arguments(prob,prize,pay) and returns true if prob *prize>pay;
    otherwise false
     */
    public static boolean profitableGamble(float prob, float prize, float pay) {

        boolean result7 = prob * prize > pay;
        return result7;
    }


}



















