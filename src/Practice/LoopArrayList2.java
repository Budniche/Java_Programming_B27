package Practice;

import java.util.ArrayList;

public class LoopArrayList2 {
    public static void main(String[] args) {

        /*  Create an ArrayList of Double elements
            Fill the ArrayList with some values
            Find the max element from the ArrayList
         */

        ArrayList<Double>  numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(Math.random());               // 0 - 1
        }

        System.out.println(numbers);

        double max = numbers.get(0);
        for (Double each : numbers) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println("Max= " + max);
    }
}