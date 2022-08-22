package day19_loops;

import day04_variables.School;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /* write a program that calculates the factorial of a number:
        ex: 5! = 5*4*3*2*1= 120
         */

        int num = new Scanner(System.in).nextInt();
        int factorial = 1;
        String msg = num + "! = ";

        for(int i = num; i>1; i--){
            factorial *= i;
            msg += i + " * ";
        }
        msg += " = " + factorial;
        System.out.println(factorial);
        System.out.println(msg);
    }
}
