package my_utils;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * takes the array of integer anr return summary of all elements of this array
     * @param arr array of int
     * @return summary of all elements of our array
     */
    public static int sumArray(int[] arr) {

        int summ = 0;
        for (int each : arr) {
            summ += each;
        }
        return summ;
    }


    /*   create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */
    public static int[] addElement(int[] arr, int num) {

        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = num;

        return newArray;
    }


    /*  create a method that will accept an int array and return the smallest number from the array  */
    public static int minNumber(int[] arr) {

        int min = 100000000;

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
    /*create a method that will accept an int array and return the biggest number from the array  */
    public static int maxNumber(int[] arr) {

        int max = -100000000;

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    /*  create a method that will accept an int array and an int number. Check and return if the given number is in the array. */
    public static boolean isContains (int[] arr, int num) {

        for (int each : arr) {
            if (num == each) {
                return true;
            }
        }
        return false;
    }


    /*  IndexOf
        create a method that will accept an int array and an int number. Find and return the index of the number in the array.
        If there is multiple occurrence return the first occurrence's index

    */
    public static int indexOf(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    /*  IndexOf
            overload the indexOf method to work with String array and String element
     */
    public static int indexOf(String[] arr, String word) {

        for (int i = 0; i < arr.length; i++) {
            if (word.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }


    public static int indexOf(double[] arr, double num) {

        for (int i = 0; i < arr.length; i++) {
            if ( num == arr[i] ) {
                return i;
            }
        }
        return -1;
    }

    /*  Add Element
    create a method that will accept a String array and a String element. Add the given element value into the end of the array.

     */
    public static String[] addElement(String[] array, String element ) {

        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }


    /*   overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the the first array.
     */
    public static String[] addElement(String[] array1, String[] array2) {

        String[] outputArray = array1;
        for (String each : array2) {
            outputArray = addElement(outputArray, each);
        }
        return outputArray;
    }

    /*
    Contains
    create a method that will accept an int array and an int number. Check and return if the given number is in the array.

     */

    public static boolean contains(int [] arr, int num){
        for(int each : arr){
            if(each == num){
                return true;
            }
        }

        return false;
    }

    /*
    IndexOf

     */

}



