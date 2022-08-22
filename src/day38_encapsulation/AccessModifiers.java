package day38_encapsulation;

public class AccessModifiers {
    public int a = 5;
    int b = 10; // this has default access because I did not use any other modifier
    private int c = 20;

    public static void main (String[] args){

        int a = 3;
        System.out.println(a);
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
