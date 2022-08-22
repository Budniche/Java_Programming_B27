package Practice;

import java.util.Scanner;

public class FactorialNumber {
    /* write a program that calculates the factorial of a number:
        ex: 5! = 5 * 4 * 3 * 2 * 1 = 120 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        int number = input.nextInt();

        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = i*fact;
        }

        System.out.println(fact);
    }
}
