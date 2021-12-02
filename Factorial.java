/*
* This program gets the factorial of an input
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-01
*/

import java.util.Scanner;

/**
* This is the marks program.
*/
final class Factorial {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Factorial() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Gets the factorial of an input.
    *
    * @param someInt this is the inputted int
    * @return returns
    */
    public static int factorial(final int someInt) {

        final int returnValue;

        if (someInt == 1) {
            returnValue = 1;
        } else if (someInt == -1) {
            returnValue = -1;
        } else if (someInt > 1) {
            returnValue = factorial(someInt - 1) * someInt;
        } else if (someInt == 0) {
            returnValue = 1;
        } else {
            returnValue = factorial(someInt + 1) * someInt;
        }
        return returnValue;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObjOne = new Scanner(System.in);
        System.out.println("Please enter an integer to get"
            + " the factorial from: ");

        try {
            final int inputInt = myObjOne.nextInt();
            final int factorialResult = factorial(inputInt);
            System.out.println(factorialResult);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("That was not a valid input ");
        }

        System.out.println("\nDone.");
    }
}
