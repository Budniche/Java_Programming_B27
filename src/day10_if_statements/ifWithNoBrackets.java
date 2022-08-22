package day10_if_statements;

public class ifWithNoBrackets {
    public static void main(String[] args) {
        if(3 < 9){
            System.out.println("First");
            System.out.println("Second");
        }

        if(3 < 9)
            System.out.println("Third");// thi is the line executed when the
            System.out.println("Fourth");// this is not a part of the if statement

        System.out.println("-------------------------");
        char a = 'a';

        if(a == 'a')
            System.out.println("letter a");
        else if(a == 'b')
            System.out.println("letter b");
        else if(a == 'c')
            System.out.println("letter c");
        else
            System.out.println("other");
    }
}
