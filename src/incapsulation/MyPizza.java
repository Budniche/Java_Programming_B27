package incapsulation;

import day05_airthmetic_operators.Pizza;

public class MyPizza {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 5);
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("large", 8);
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza("large1", 8);
        System.out.println(pizza3);

        Pizza pizza4 = new Pizza("medium", 100);
        System.out.println(pizza4);

    }

}
