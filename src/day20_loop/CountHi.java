package day20_loop;

public class CountHi {
    public static void main(String[] args) {

        //counting how many times hi is in the String
        String s = "abhicdhihelhilo";

        // spproach 1: while loop and delete the first occurence each time

        int count = 0;

        while(s.contains("hi")){
            count++;
            s = s.replaceFirst("hi", "");
        }
        System.out.println(count);

        String s2 = "ajkllkllhikllhikdjhi";
        int count2 = 0;

        for(int i = 0; i < s2.length(); i++){

            if(s2.charAt(i) == 'h' && s2.charAt(i + 1) == 'i'){
                count2++;
            }
        }

    }
}
