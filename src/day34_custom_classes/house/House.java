package day34_custom_classes.house;

public class House {

    String type;
    double squareFeet;
    int numberOfBedrooms;
    int getNumberOfBethrooms;
    boolean inCity;
    boolean hasGarage;



    public double calculateMortage(){

        if(numberOfBedrooms < 2) {
            return 1500;

        } else if(numberOfBedrooms < 4){
            return 2000;

        }else{
            return 2500;
        }
    }


    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", getNumberOfBethrooms=" + getNumberOfBethrooms + "," +
                (inCity ? "In the City" : "In the suburbs") + ","
               + (hasGarage ? "Has Garage" : "No Garage. Street parking");


    }
}
