import java.util.Scanner;

public class StringClass extends TrueFalseClass {
    //multilevel inheritance
    // return type with parameter
    //4. create a function that returns true if a string is empty and false otherwise.
    public  static boolean  isEmpty(String str){

        boolean result4=str.isEmpty();
        return result4;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("4.Enter a String:");
        String str=scanner.nextLine();
        if(str.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        isEmpty(scanner.nextLine());


    }
}
