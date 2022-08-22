package day17_string;

public class MoreMethods {

    public static void main(String[] args) {

        // isEmpty()

        String s = "hello";
        System.out.println(s.isEmpty());

        String s2 = " "; // space char
        System.out.println(s2.isEmpty());

        String s3 = ""; // empty space, String but no characters
        System.out.println(s3.isEmpty());

        // isBlank()

        String a = "    "; // spaces are characters
        System.out.println(a.isEmpty()); // checks if there is characters
        System.out.println(a.isBlank()); // checks for non space characters

        String b = "h";
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());


    }
}
