package day10_if_statements;

public class NumberToDay {
    public static void main(String[] args) {

        int number = 9;

        if(number == 1){
            System.out.println("Day is Monday");
        } else if(number == 2){
            System.out.println("Day is Tuesday");
        } else if(number == 3){
            System.out.println("Day is Wednesday");
        } else if(number == 4){
            System.out.println("Day is Thursday");
        } else if(number == 5){
            System.out.println("Day is Friday");
        } else if(number == 6){
            System.out.println("Day is Saturday");
        }else if (number == 7){
            System.out.println("Day is Sunday");
        }else {
            System.out.println(number + " is not valid day number");

        }
    }
}
