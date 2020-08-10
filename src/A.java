import java.util.Scanner;

public class A {
    //18
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

    public static void main(String[] args) {
        toFindVowelOrNot();
        passOrFail();
    }
}
