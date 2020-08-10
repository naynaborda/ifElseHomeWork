import java.util.Scanner;

public class IntClass extends StringClass {
    //multilevel inheritance
    //return type with parameter
    //5.create a method that takes an integer as an argument and returns even for even integers and odd for odd integers.
    public static boolean isEvenOrOdd(int d) {
        boolean result5 = d % 2 == 0;
        return result5;
    }

    // no return type without parameter
    /*6.create a method that takes an integer as its only argument and returns true if it's less than or equal
    to zero, otherwise return false.
     */
    public static void lessThanOrEqualToZero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("6.Enter the number to check if it is less than or equal to zero or not: ");
        int e = scanner.nextInt();
        if (e <= 0) {
            System.out.println("Given Number is less than or equal to 0 = true");
        } else {
            System.out.println("Given Number is not less than or equal to 0 = false");
        }
    }


    /*8.Write a function that takes two numbers and return if they should be added,subtracted,multiplied or divided
    to get 24. if none of the operations can give 24,return none.
     */
    public static void operation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("8.Enter the number1 for operation: ");
        int number1 = scanner.nextInt();
        System.out.print("8.Enter the number 2 for operation: ");
        int number2 = scanner.nextInt();
        if (number1 + number2 == 24) {
            System.out.println("Addition of two number is = 24: added");
        } else if (number1 - number2 == 24) {
            System.out.println("Subtraction  of two number  is = 24: subtracted");
        } else {
            System.out.println("None of operation is: none");
        }


    }


    /* 9.you are given 2 out of 3angels in a triangle,in degrees.  Write a function that classifies the missing angle as
    either acute ,right or obtuse based on its degrees.
     */
    public static void missingAngles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("9.Enter a first  angle 1: ");
        int ang1 = scanner.nextInt();
        System.out.print("9.Enter a second  angle2: ");
        int ang2 = scanner.nextInt();
        int ang3 = 180 - ang1 - ang2;
        if (ang3 < 90) {
            System.out.println("Given angle is = An Acute Angle");
        } else if (ang3 == 90) {
            System.out.println("Given angle is = A Right Angle");
        } else {
            System.out.println("Given angle is = An Obtuse Angle");
        }
    }

    /*10. create a function that takes two numbers and  a mathematical operator+-/* and will perform a calculation with
    given numbers.
     */
    public static void caluculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("10.Enter a  num1 for calculator : ");
        int num1 = scanner.nextInt();
        System.out.print("10.Enter a num2 for calculator : ");
        int num2 = scanner.nextInt();
        System.out.print("10.Enter an operator: ");
        String ope = scanner.next();

        if (ope.equals("+")){
           int result=num1+num2;
            System.out.println(num1+" "+ope+num2+"= "+result);
           // System.out.println("Your answer is "+(num1+num2));
        }else if(ope.equals("-")){
            int result1=num1-num2;
            System.out.println(num1+" "+ope+num2+"= "+result1);
           // System.out.println("Your answer is "+(num1-num2));
        }else if (ope.equals("*")){
            int result2=num1*num2;
            System.out.println(num1+" "+ope+num2+"= "+result2);
           // System.out.println("Your answer is "+(num1*num2));
        }else if (ope.equals("/")){
            int result3=num1/num2;
            System.out.println(num1+" "+ope+num2+"= "+result3);
            //System.out.println("your answer is "+(num1/num2));
        }else {
            System.out.println("You have entered wrong operator");
        }
       // System.out.println(num1 + " " + ope + " " + num2);



    }

    /*11. Given a year you must implement a function that returns true if it's leap year, or false if it's not.
    A leap year must either be divisible by 400 or divisible by 4 and not 100.     */

    public static void isLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("11.Enter any year to check for leap year: ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("If it is leap year = True");
        } else {
            System.out.println("If it is not leap year = false");
        }


    }


    /* 12.WAP to input student name ,roll no,3 subjects marks and find out total,percentage and result if he is pass or
    fail on basis of percentage(pass>=35)and also given them grade.
    >=80 A+,>=60 A,>=50 B,>=35 C.
     */
    public static void studentResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("12.Enter a student name: ");
        String name = scanner.nextLine();
        System.out.print("12.Enter a student roll no: ");
        int rollNo = scanner.nextInt();
        System.out.print("12.Enter the marks for Maths,science,english: ");
        int mathsMarks = scanner.nextInt();
        int englishMarks = scanner.nextInt();
        int scienceMarks = scanner.nextInt();
        float total = mathsMarks + englishMarks + scienceMarks;
        float percentage = total / 300 * 100;
        if (percentage <= 35) {
            System.out.println(name+", "+"Roll number is "+rollNo+", "+"Percentage is "+percentage+" ,"+"Fail");
        } else if (percentage >= 80) {
            System.out.println(name+", "+"Roll number is "+rollNo+", "+"Percentage is "+percentage+" ,"+"Pass,"+"Grade A+");
        } else if (percentage >= 60) {
            System.out.println(name+" "+"Roll number is "+rollNo+", "+"Percentage is "+percentage+", "+"Pass,"+"Grade A");
        } else if (percentage >= 50) {
            System.out.println(name+" "+"Roll number is "+rollNo+" ,"+"Percentage is "+percentage+", "+"Pass,"+"Grade B");
        } else if (percentage >= 35) {
            System.out.println(name+" "+"Roll number is "+rollNo+", "+"Percentage is "+percentage+" ,"+"Pass,"+"Grade C");
        }




    }

    //13. same as 12.but pass or fail pn the basis of student needs to pass all the subjects.
    public static void passOrFail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("13.Enter a student name: ");
        String name = scanner.nextLine();
        System.out.print("13.Enter a student roll no: ");
        int rollNo = scanner.nextInt();
        System.out.print("13.Enter the marks for Maths,science,english: ");
        int mathsMarks = scanner.nextInt();
        int englishMarks = scanner.nextInt();
        int scienceMarks = scanner.nextInt();
        float total = mathsMarks + englishMarks + scienceMarks;
        float percentage = total / 300 * 100;
        if (englishMarks < 35 || scienceMarks < 35 ||mathsMarks < 35) {
            System.out.println(name+", "+"Roll number is "+rollNo+","+"fail");
        } else if (percentage >= 80) {
            System.out.println(name+", "+"Roll number is "+rollNo+", "+"Percentage is "+percentage+" ,"+"Pass, "+"Grade A+");
        } else if (percentage >= 60) {
            System.out.println(name+" "+"Roll number is "+rollNo+", "+"Percentage is "+percentage+", "+"Pass, "+"Grade A");
        } else if (percentage >= 50) {
            System.out.println(name+" "+"Roll number is "+rollNo+" ,"+"Percentage is "+percentage+", "+"Pass, "+"Grade B");
        } else if (percentage >= 35) {
            System.out.println(name+" "+"Roll number is "+rollNo+", "+"Percentage is "+percentage+" ,"+"Pass," +"Grade C");
        }




    }


    //14.WAP input any five number and then find average of five numbers.
    public static int averageNumber(int no1, int no2, int no3, int no4, int no5) {
        int total = no1 + no2 + no3 + no4 + no5;
        int average = total / 5;
        return average;


    }

    //15.Input any alphabet in uppercase and print it in lower case
    public static void upperCaseLowerCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("15.Enter any alphabet in uppercase: ");
        String alphabet = scanner.next().toLowerCase();
        System.out.println(alphabet);

    }
    /*16.input any alphabet from a to f and print their city name accordingly any other alphabet should be invalid
     entry
     */

    public static void cityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("16.Enter any alphabet from a to f to print their city name accordingly: ");
        String cityName = scanner.next();
        if (cityName.equals("a")) {
            System.out.println("America");
        } else if (cityName.equals("b")) {
            System.out.println("Bombay");
        } else if (cityName.equals("c")) {
            System.out.println("China");
        } else if (cityName.equals("d")) {
            System.out.println("Delhi");
        } else if (cityName.equals("e")) {
            System.out.println("Egypt");
        } else if (cityName.equals("f")) {
            System.out.println("France");
        } else {
            System.out.println("invalid entry");
        }


    }

    //17.Enter any value and the find out if it is number or an alphabet or symbol.
    public static void alphabetNumberSymbol() {

        //any number will include in 0 to 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("17.Enter any value to know alphabet,number or symbol:");
        char char1 = scanner.next().charAt(0);
        if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
            System.out.println("Given Value is Alphabet: ");
        } else if ((char1 >= '0' && char1 <= '9')) {
            System.out.println("Given Value  is Number: ");
        } else {
            System.out.println("Char is Symbol: ");
        }

    }

    /*18.Provide a single character from alphabet .Print vowel or consonant,depending on the user input.ifthe user input
    is not a letter(between a nad z or A and Z),or is a String of length>1,print an error message
     */
    public static void toFindVowelOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("18.Enter any alphabet to test if it is vowel or consonant: ");
        String letter = scanner.next();
        if (letter.length() > 1) {
            System.out.println("Error. Not a single character.");

        } else if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")) {
            System.out.println("Input letter is Vowel");
        } else if (!(letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z') && (!(letter.charAt(0) >= 'A'&& letter.charAt(0) <= 'Z'))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }else {
            System.out.println("Input letter is Consonant");
        }


    }



    //19.input number 1 to 12 and output should be monthName
    public static void monthName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("19.Enter number 1 to 12 to find out Month Name: ");
        int number1to12 = scanner.nextInt();
        if (number1to12 == 1) {
            System.out.println("This month is January");
        } else if (number1to12 == 2) {
            System.out.println("This month is February");
        } else if (number1to12 == 3) {
            System.out.println("This month is March");
        } else if (number1to12 == 4) {
            System.out.println("This month is April");
        } else if (number1to12 == 5) {
            System.out.println("This month is May");
        } else if (number1to12 == 6) {
            System.out.println("This month is June");
        } else if (number1to12 == 7) {
            System.out.println("This month is July");
        } else if (number1to12 == 8) {
            System.out.println("This month is August");
        } else if (number1to12 == 9) {
            System.out.println("This month is September");
        } else if (number1to12 == 10) {
            System.out.println("This month is October");
        } else if (number1to12 == 11) {
            System.out.println("This month is November");
        } else if (number1to12 == 12) {
            System.out.println("This month is December");
        } else {
            System.out.println("This is not a Month");
        }
    }


    /*20.WAP input sales id,seller's name,sales amount,salary  basic and then find this sales commission.sales amount
    >= 50,000 35%, >=30000 20%, >=20,000 10%, >=10000 5%,<10,0002%
     */
    public static void salesCommission() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("20.Enter sales id: ");
        String salesId = scanner.nextLine();
        System.out.print("20.Enter seller's name:");
        String sellerName = scanner.nextLine();
        System.out.print("20.Enter sales amount:");
        double salesAmount = scanner.nextDouble();
        System.out.print("20.Enter salary basic:");
        double salaryBasic=scanner.nextDouble();
        if (salesAmount >= 50000) {
            double commission = (salesAmount * 0.35);
            System.out.println("\""+salesId+"\","+"\""+sellerName+"\","+commission);
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            double commission = (salesAmount * 0.20);
            System.out.println("\""+salesId+"\","+"\""+sellerName+"\","+commission);
        } else if (salesAmount >= 20000 && salesAmount < 30000) {
            double commission = (salesAmount * 0.10);
            System.out.println("\""+salesId+"\","+sellerName+"\","+commission);
        } else if (salesAmount >= 10000 && salesAmount < 20000) {
            double commission = (salesAmount * 0.05);
            System.out.println("\""+salesId+"\","+sellerName+"\","+commission);
        } else if (salesAmount < 10000) {
            double commission = (salesAmount * 0.02);
            System.out.println("\""+salesId+"\","+sellerName+"\","+commission);
        }

    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IntClass intClass = new IntClass();
        //1.calling less than hundred method from it's super class (grandparent) class
        System.out.print("1.Enter the two numbers to see if sum of both " +
                "numbers is less than 100 or not : ");
        if (lessThanHundred(scanner.nextInt(), scanner.nextInt())) {
            System.out.println("Both Numbers sum is less than 100 = true");
        } else {
            System.out.println("Both Numbers sum is more than 100 = false");
        }

        //2.calling divisible by five method from true false class(super class)
        System.out.print("2.Enter the number to check if it is divisible by 5 or not: ");
        divisibleByFive(scanner.nextInt());

        //3.calling divisible hundred method from it's  super class
        System.out.print("3.Enter the number to check if it is divisible by 100 or not:  ");
        if (intClass.divisibleByHundred(scanner.nextInt())) {
            System.out.println("Given number is divisible by 100 = true");
        } else {
            System.out.println("Given number is not divisible by 100 = false");
        }


        //4. calling from Stringclass

        System.out.print("4.Enter a String to test if it is empty or not:");
        String str=scanner.nextLine();
        if(str.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        isEmpty(scanner.nextLine());

        //5.
        System.out.print("5.Enter number to check if it is odd or even: ");
        if (isEvenOrOdd(scanner.nextInt())) {
            System.out.println("Given Number is even");
        } else {
            System.out.println("Given Number is odd ");
        }


        //6.
        lessThanOrEqualToZero();

        //7.calling method from its super class.
        System.out.print("7.Enter the value for prob : ");
        System.out.print("Enter the value for prize :");
        System.out.print("Enter the value for pay : ");
        if (profitableGamble(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat())) {
            System.out.println("If net profit is >0 = true");
        } else {
            System.out.println("If net profit is <0 =false");
        }

        //8.
        operation();

        //9.
        missingAngles();


        //10.
        caluculator();

        //11.
        isLeapYear();

        //12.
        studentResult();

        //13.
        passOrFail();


        //14.
        System.out.print("14.Enter the 5 numbers for average :");
        System.out.println(averageNumber(scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));


        //15.
        upperCaseLowerCase();

        //16.
        cityName();

        //17.
        alphabetNumberSymbol();


        //18.

        toFindVowelOrNot();

        //19.
        monthName();

        //20.
        salesCommission();


    }

}
