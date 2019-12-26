import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        SimpleCalculation();

    }

    public static void SimpleCalculation() {

        String inchar;
        double innum1;
        String inlet1;
        char op;
        double innum2;

        Scanner myCalc = new Scanner(System.in);
        Scanner myLet = new Scanner(System.in);
        Scanner myOp = new Scanner(System.in);

        System.out.println("What do you want to calculate with? Numbers or letters? Type l for letter and n for number");
        inchar = myLet.next();

        switch (inchar) { //Decides whether n or l shall be used.
            case "n": { //Stands for number, if you solely want to calculate with numbers.

                System.out.println("Enter your first digit(s):");
                innum1 = myCalc.nextInt();

                System.out.println("Enter +, -, *, or / below:");
                op = myOp.next().charAt(0);

                System.out.println("Enter your second digit(s):");
                innum2 = myCalc.nextDouble();

                switch (op) { //Choose addition, subtraction, multiplication or division.
                    case '+': //Addition
                        System.out.println(innum1 + innum2);
                        break;
                    case '-': //Subtraction
                        System.out.println(innum1 - innum2);
                        break;
                    case '*': //Multiplication
                        System.out.println(innum1 * innum2);
                        break;
                    case '/': //Division
                        if (innum2 == 0) {
                            System.out.println("You can't divide by zero.");
                        } else if (innum2 != 0) {
                            System.out.println(innum1 / innum2);
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        break;
                }
                break;
            }

            case "l": { //Stands for letter, if you want to calculate with a letter assigned calculation method.
                System.out.println("Enter your letter you want to calculate with:");
                inlet1 = myLet.next();

                switch (inlet1) {
                    case "f": //Factorial calculation
                        int facul = 1;
                        int result;

                        System.out.println("Enter your digit(s):");
                        innum2 = myCalc.nextDouble();

                        for (innum2 = innum2; innum2 > 0; innum2--) {
                            facul = (int) (facul * innum2);
                        }
                        System.out.println("Sum: " + facul);
                }
                break;
            }

            default:
                break;
        }
    }
}
