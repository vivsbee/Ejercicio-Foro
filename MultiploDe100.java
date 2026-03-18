import java.util.Scanner;

public class MultiploDe100 {

    /*
    * This program reads an integer from the user
    * and determines whether it is a multiple of 100.
    * It uses a method to check the condition
    * and another method to display the result.
    */

    // This is a method for checking whether a number is a multiple of 100
    public static boolean isMultipleOf100(int number) {
        return number % 100 == 0;
    }

    // This is the method that displays the result to the user
    public static void showResult(int number) {
        if (isMultipleOf100(number)) {
            System.out.println(number + " is a multiple of 100");
        } else {
            System.out.println(number + " is not a multiple of 100");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("100s Multiplier Calculator");
        System.out.println("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            showResult(number);
        } else {
            System.out.println("Invalid input");
            scanner.next();
        }

        System.out.println("End");

        scanner.close();
    }
}