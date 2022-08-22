package day20_loop;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Space program

        Given a String return a version of with spaces between all of the letters.
        If there is already a space in the String put an underscore

        Ex: java -> java
        space -> space
        more words -> more_words
         */

        String s = "java";
        String result = "";

        for(int i = 0; i <s.length(); i++) { //i <=s.length() -1
         char letter = s.charAt(1);

         if(letter == ' '){
             result += "- ";
         } else {
             result += letter + " ";
         }
    }
        System.out.println(result.trim());

        /*
        hello world
        int i = 0
        charAt(I)  - > charAt(0) -> h

        if(letter == ' ') h == '  ' -> false
        else -> "h " + e
         */
}}
