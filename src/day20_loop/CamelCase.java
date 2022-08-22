package day20_loop;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str = input.nextLine().toLowerCase();
        String camelCase = "";

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ' ') { // when there is a space character it will do some action, add the next character as uppercase as the start of the next word
                camelCase += str.substring(i+1, i+2).toUpperCase(); // gives the one character after the space
    //str.substring(i+1)
                i++;

            }else {
                camelCase += str.charAt(i);

            }
        }
        System.out.println(camelCase);
    }
}
