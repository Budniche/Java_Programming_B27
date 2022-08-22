package day39_inheritance.access.b;

import day39_inheritance.access.a.Runner;

public class RunnerB extends TownHouse{
    public static void main(String[] args) {

        //Q: What does TownHouse inherit from House?

        // in different packages

        TownHouse house = new TownHouse();
        house.address = "1234 road";
//        house.city = "Virginia"; no accessible outside the package
        //house.state; state is default, so only accessible in the same package
        // house.zipcode zipcode is private, so only accessible in the same class
    }
}
