package day33_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    /*
    ---------------------------------------------------------------------------

Separate Parts

Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "in", "the", "hat", "hello", "world"));
        System.out.println(switchPairs(list));

    }
    // temp = cat
    public static ArrayList<String> switchPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
      //      System.out.println("pairs: " + list.get(i) + " & " + list.get (i+1));
            String temp = list.get(i);
            list.set(i, list.get(i +1));
            list.set(i +1, temp);
        }
        return list;

    }
}