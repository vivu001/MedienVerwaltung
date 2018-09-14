package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denomirator) throws ArithmeticException{
        System.out.println("Catched !!");
        return numerator / denomirator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Please enter an interger numerator: ");
                int numerator = sc.nextInt();

                System.out.print("Please enter an interger denomirator: ");
                int denomirator = sc.nextInt();

                System.out.printf("%nResult: %d / %d = %d%n", numerator, denomirator, quotient(numerator, denomirator));
                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                sc.nextLine();
                System.out.printf("You must enter integers. Please try again \n\n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again \n\n");
            }
        } while (continueLoop);
    }
}
