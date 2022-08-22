package day39_inheritance.access.a;

public class Runner {
    public static void main(String[] args) {

        Condo condo = new Condo();
        condo.address = "1312 l";
        condo.city = "Chicago";
        condo.state = "IL"; // is inherited because we are in the same package
        //condo.zipcode = zipcode was private so it doesn't inherit
    }
}
