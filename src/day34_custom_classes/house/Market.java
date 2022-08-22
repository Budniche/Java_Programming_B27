package day34_custom_classes.house;

public class Market {

    public static void main(String[] args) {

        House house1 = new House();
        house1.type = "Townhouse";
        house1.squareFeet = 1300;
        house1.getNumberOfBethrooms = 2;
        house1.numberOfBedrooms = 3;
        house1.inCity = false;
        house1.hasGarage = true;

        System.out.println(house1);// do not need to call toString, because it is automatically called

        System.out.println(house1.calculateMortage());



    }
}
