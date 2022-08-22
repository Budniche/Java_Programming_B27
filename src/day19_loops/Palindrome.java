package day19_loops;

public class Palindrome {
    public static void main(String[] args) {
        /*
        given a String determine if it is palindrome          means thr String is read the same forwards and backwards

        ex:
        anna
        racecar
        maam
        abcba

         */
        String s = "racecar";
        String reverse = "";

        // reverse my String, read it beack from last index to first, backwards

        for (int i = s.length() - 1; i >= 0; i--) {// i just a number, but using length - 1 allow me to find the last index of the String, that means we can use that index to read characters
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println(s.equals(reverse) ? "Palindrome" : "Not Palindrome");

    }


    }

