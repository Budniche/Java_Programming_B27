package day03_variables;

public class Store {
    public static void main(String [] args){

        int numberOfItems = 1000;
        System.out.println(numberOfItems+"  in the store"); // combines the value other numberOfItems variables with the characters 'in the store'
        numberOfItems = 700; // reassigned 700 into the variable
        System.out.println(numberOfItems + " after the sale");
        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment= " + totalAfterShipment); //soutv


        double totalCost = 1_000_000.99; // 10,000,000.99 -> how we write it, but commas are not valid java syntax, so we can use underscore it numbers, to improve readability
        System.out.println(totalCost);

        float f = 19.99F; // adding the letter f/F will tell the compilier this is a float number, not a double number

        float f2 = 100; // 100 is int type by default, and int smaller than float, so there is no problem here
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 100; valid if I wanted;
        // float f2 = 100F;
        // float f2 = 100.99F:
        long population = 8_000_000_000L; // adding l\L to the number will change the type from int(the dafault) to a long type, because 8 billion was too big to be held in an int type
        System.out.println(population);


    }
}
