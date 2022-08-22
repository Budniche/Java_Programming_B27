package day15_string;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        /*

         */


        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your website");
        String website = input.next();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if (validStart && validEnd) {
            System.out.println(website + "is valid");
        } else {
            System.out.println(website + " is invalid");

            if (!validStart) {
                System.out.println("Website should stsrt with .www");
            }
            if (!validEnd) {
                System.out.println("Website should end with .com, .edu, .gov");


            }
        }
    }}