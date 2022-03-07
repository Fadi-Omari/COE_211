import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private double result ;

    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);

    System.out.println("please eneter the first number : ");
    scanCalc.nextDouble();
    System.out.println("please eneter the operator : ");
    scanCalc.nextLine();
    System.out.println("please eneter the second number : ");
    scanCalc.nextDouble();
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }

    public String add(int a, int b) {
       result = a + b ;
       return result + "";
    }

    public String subtract(int a, int b) {
        result = a - b ;
        return result + "";
    }

    public String multiply(int a, int b) {
        result = a * b ;
        return result + "";
    }

    public String divide(int a, int b) {
       result = a/b ;
        return result + "";
    }
}