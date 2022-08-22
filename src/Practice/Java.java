package Practice;

import java.util.Scanner;

public class Java {
            public static void main(String[] args) {
                //DO NOT TOUCH FOLLOWING LINE/LINES
                Scanner scan = new Scanner(System.in);
                String sentence = scan.nextLine();

                /*
                Use a loop to count how many times the characters java and python are found in the given String sentence. Output true if java and python appear the same number of times, otherwise output false.
Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings
                 */

                //WRITE YOUR CODE BELOW

                int countJava = 0;
                int countPython = 0;

                for (int i = 0; i <= sentence.length() - 4; i++) {
                    if (sentence.substring(i, i + 4).equals("java")) {
                        countJava++;
                    }
                }
                for (int i = 0; i <= sentence.length() - 6 ; i++) {

                    if (sentence.substring(i, i + 6).equals("python")){
                        countPython++;
                }
                }
                System.out.println(countJava == countPython);
            }
        }

