package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class test {

        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            int[] nums = new int[3];
            for(int i =0; i < 3; i++) {
                nums[i] = scan.nextInt();
            }

            //WRITE YOUR CODE BELOW

            int [] numbersCopy = Arrays.copyOf(nums, 6);
            System.out.println(Arrays.toString(numbersCopy));

        }
    }