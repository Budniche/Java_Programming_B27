package day04_variables;

public class Recap {
    public static void main (String [] args){

        //declare veriables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftskillsDays;

        System.out.println("temperature");

        // assigning value to variables
        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftskillsDays = 2;

        System.out.println("temperature = " + temperature + " Celsius ");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftskillsDays = " + numberOfSoftskillsDays);

        //declare and assign at same time
        int numberOrCoffeeCups = 2;
        float ratingOfMovie = 8.9f; // compiler takes 8.9 as double type, we add F to the end to make float type
        long waterInOcean = 200_000_000_000_000L; // compiler takes 20000000000000 as int type, but this number is too big for int, so doesn't compile, we need to add L to make it a long type

        System.out.println("numberOrCoffeeCups = " + numberOrCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean + " liters ");




    }
}
