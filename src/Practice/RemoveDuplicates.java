package Practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    /*
    Remove Duplicates

Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers


Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
     */


    public static void main(String[] args) {

        ArrayList<Integer>  list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(list1);

        System.out.println(removeDuplicate(list1));

    }


    public static ArrayList<Integer>  removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer>  listDuplicate = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i) == list.get(j)) {
                    listDuplicate.add(list.get(i));
                    break;
                }
            }
        }
        list.removeAll(listDuplicate);
        return list;
    }

}