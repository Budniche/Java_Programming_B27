package Practice;

import java.util.Arrays;

public class PrintEachElement {
   /*   Write a program that can print out the common elements from each inner element of a 2D array
        Ex:
           int[][] arr {
                  {4, 1, 24, 5},
                  {24, 1, 5, 2},
                  {4, 1, 5, 1}
           }
     */


    public static void main(String[] args) {


        int[][] arr = {
                {4, 1, 24, 5},              // [0][0],   [0][1],    [0][2],    [0][3]
                {24, 1, 5, 2},              // [1][0],   [1][1],    [1][2],    [1][3]
                {4, 1, 5, 1}                // [2][0],   [2][1],    [2][2],    [2][3]
        };

        for (int i = 0; i < arr[0].length; i++) {

            for (int j = 0; j < arr[1].length; j++) {

                if (arr[0][i] == arr[1][j]) {

                    for (int k = 0; k < arr[2].length; k++ ) {
                        if (arr[0][i] == arr[2][k]) {
                            System.out.println(arr[0][i]);
                            break;
                        }
                    }
                }
            }
        }
    }
}