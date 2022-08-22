package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        /*
        [IQ] Given a number n, print the output based on the following conditions:

        the number is divisible by 3 print Fizz
        the number is divisible by 5 print Buzz
        the number is divisible by 3 and 5 print FizzBuzz
        if the number is not  divisible by any  print just the number

        Ex:
        n=10
        Buzz

        n=12
        Fizz

        n=13
        13

        n=15
        FizzBuzz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = input.nextInt();
      // int n = 300; hardcoded version

        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");

    } else if(n % 3 == 0){
            System.out.println("Fizz");
        } else if (n % 5 == 0){
        System.out.println("Buzz");
    } else {
            System.out.println(n);
    }
}}
