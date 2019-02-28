import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeat;

        do {

            System.out.println("What is the first number? ");
            double firstNumber = scanner.nextDouble();

            System.out.println("What is the operation? (+, -, *, /): ");
            String operation = scanner.next();

            System.out.println("What is the second number? ");
            double secondNumber = scanner.nextDouble();

            double result;

            if (operation.equals("+")){
                result = firstNumber + secondNumber;
            }
            else if (operation.equals("-")){
                result = firstNumber - secondNumber;
            }
            else if (operation.equals("*")){
                result = firstNumber * secondNumber;
            }
            else if (operation.equals("/")){
                result = firstNumber / secondNumber;
            }
            else {
                System.out.println("I don't recognise your operation. ");
                result = 0;
            }

            System.out.println("Do you want to solve another equation? Type 1 for yes, 2 for no. ");
            repeat = scanner.nextInt();

            System.out.println("Your result is ");
            System.out.println(result);
        } while (repeat == 1);

    }
}
