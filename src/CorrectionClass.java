import java.util.Scanner;

public class CorrectionClass {
    //4
    public  static boolean  isEmpty(String str){

        boolean result4=str.isEmpty();
        return result4;


    }
    public static void salesCommission() {
        //20

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








    public static void main(String[] args) {
        //4.
        Scanner scanner=new Scanner(System.in);
        System.out.print("4.Enter a String:");
        String str=scanner.nextLine();
        if(str.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        isEmpty(scanner.nextLine());
        //20.
        salesCommission();

        //17.
        alphabetNumberSymbol();

    }
}
