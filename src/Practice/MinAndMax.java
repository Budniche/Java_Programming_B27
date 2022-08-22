package Practice;

/*
Multidimensional array practice
---------------------------------------------------------------------------

Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array
 */

public class MinAndMax {
    public static void main(String[] args) {
        int [] [] array20 = {
                {1, 5, 2, 23},
                {-12, 41, -5, -2},
                {1, 5, 1, 5},
        };

        int min = -1000_000;
        int max = 1000_000;

        for(int [] innerArray : array20){  // outer loop: arrays
            for(int number : innerArray){  // immer loop: each element outer loop
            if (number>max){

            }

            if(number<min){
                min = number;
            }
        }

    }
        System.out.println("max = " +max);
        System.out.println("max = " +min);
}}
