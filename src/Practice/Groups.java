package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Groups {
    public static void main(String[] args) {

        /*
        We did the group task together, try to make it completely dynamic with Scanner inputs. Ask the number of groups, the number of people in group1, group2, group3, etc... and ask for the name of each person on the group and assign into the array
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of groups");
        int numGroups = input.nextInt();

        String[][] people = new String[numGroups][];

        for (int i  = 0; i  < numGroups; i ++) {

            System.out.println("Enter the number of people in the group # " + (i+1) );
            int pplQuantity = input.nextInt();
            input.nextLine();

            String [] pplNames = new String[pplQuantity];

            for (int j = 0; j < pplQuantity; j++ ) {
                System.out.print("Enter the name > " );
                pplNames[j] = input.nextLine();
            }

            people[i] = pplNames;
        }

        System.out.println(Arrays.deepToString(people));
    }
}