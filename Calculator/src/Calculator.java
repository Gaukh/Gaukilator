import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        SimpleCalculation();
    }

    public static void SimpleCalculation() {

        double input1;
        char operator;
        double input2;

        Scanner myCalc = new Scanner(System.in);
        Scanner myOp = new Scanner(System.in);

        try {
            System.out.println("Enter your first digit(s) or operating letter:");
            input1 = myCalc.nextInt();

            System.out.println("Enter +, -, *, or / below:");
            operator = myOp.next().charAt(0);

            System.out.println("Enter your second digit(s):");
            input2 = myCalc.nextDouble();

            switch (operator) {
                case '+':
                    if (operator == '+') {
                        System.out.println(input1 + input2);
                    }
                    break;
                case '-':
                    if (operator == '-') {
                        System.out.println(input1 - input2);
                    }
                    break;
                case '*':
                    if (operator == '*') {
                        System.out.println(input1 * input2);
                    }
                    break;
                case '/':
                    if (operator == '/' && input2 == 0) {
                        System.out.println("You can't divide by zero, idiot.");
                    } else if (operator == '/' && input2 != 0) {
                        System.out.println(input1 / input2);
                    }
                    break;
                default:
                    break;
            }

        } catch (InputMismatchException ime) {
            System.out.println("No letters allowed, this is a simple calculator you fuckyducky."); }
    }
}
