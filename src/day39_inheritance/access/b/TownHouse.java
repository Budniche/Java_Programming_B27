package day39_inheritance.access.b;

import day39_inheritance.access.a.House;

public class TownHouse extends House {
    public static void main(String[] args) {

        //Q: What does TownHouse inherit from House?

        //in different packages

        TownHouse house = new TownHouse();
        house.address = "1234 road";
        house.city = "Virginia";
        // Did I inherit the city veriable? yes
    }
}
