package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        /*
        vending maschine
        snacks
        1
        2
        3
        drinks
        4
        5
        6

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vending Machine. Selrct the menu you want to see:\n\tSnacks\n\tDrinks");String menu = input.next();
        switch(menu){
            case "Snacks":
                System.out.println("Pick the snack number:\n1)Chips 2)Cookies 3)Pretzels 4)Candy");
                int snackOption = input.nextInt();

                if(snackOption == 1) {
                    System.out.println("Chips are selected");
                }else if(snackOption == 2) {
                    System.out.println("Cookies are my favorite");
                }else if(snackOption == 3) {
                    System.out.println("Pretzels dispensing");
                }else if(snackOption == 4) {
                    System.out.println("Candy coming right up");
                }else{
                    System.out.println("Not a valid item");
                }

            case "Drinks":
                System.out.println("Pick the  number:\n1)Juice 2)Soda");
                int drinkOption = input.nextInt();

                if(drinkOption ==1) {
                    System.out.println("Giving juice");
                }else if(drinkOption == 2){
                    System.out.println("Giving soda");
                }
        }
    }
}
