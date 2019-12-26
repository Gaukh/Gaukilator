import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        SimpleCalculation();
    }

    public static void SimpleCalculation() {

        String inputChar;
        char n;
        char l;
        double input1num;
        String input1let;
        char operator;
        double input2num;

        Scanner myCalc = new Scanner(System.in);
        Scanner myLet = new Scanner(System.in);
        Scanner myOp = new Scanner(System.in);

        System.out.println("What do you want to calculate with? Numbers or letters? Type l for letter and n for number");
        inputChar = myLet.next();

        switch (inputChar) {

            case "n": {

                System.out.println("Enter your first digit(s):");
                input1num = myCalc.nextInt();

                System.out.println("Enter +, -, *, or / below:");
                operator = myOp.next().charAt(0);

                System.out.println("Enter your second digit(s):");
                input2num = myCalc.nextDouble();

                switch (operator) {
                    case '+':
                        if (operator == '+') {
                            System.out.println(input1num + input2num);
                        }
                        break;
                    case '-':
                        if (operator == '-') {
                            System.out.println(input1num - input2num);
                        }
                        break;
                    case '*':
                        if (operator == '*') {
                            System.out.println(input1num * input2num);
                        }
                        break;
                    case '/':
                        if (operator == '/' && input2num == 0) {
                            System.out.println("You can't divide by zero, idiot.");
                        } else if (operator == '/' && input2num != 0) {
                            System.out.println(input1num / input2num);
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        break;
                }
                break;
            }

            case "l": {
                System.out.println("Enter your letter you want to calculate with:");
                input1let = myLet.next();

                switch (input1let) {
                    case "f": //Factorial calculation
                        int result;
                        System.out.println("Enter your digit(s):");
                        input2num = myCalc.nextDouble();
                        for (input2num = input2num; input2num > 0; --input2num) {
                            result = (int) (--input2num * input2num);
                            result = (int) (result + input2num);
                            System.out.println("Result: " + result);
                    }

                }


                break;
            }

            default:
                break;

        }


        try {

        } catch (InputMismatchException ime) {
            System.out.println("No letters allowed, this is a simple calculator you fuckyducky."); }
    }
}
