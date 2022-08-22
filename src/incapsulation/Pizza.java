package incapsulation;

public class Pizza {

    private String size;
    private int numberOfToppings;


    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large") ) {
            this.size = size;
        } else {
            this.size = "";
        }
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings >= 0 && numberOfToppings <= 20) {
            this.numberOfToppings = numberOfToppings;
        }
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }


    public Pizza(String size, int numberOfToppings)   {
        setSize(size);
        if (! this.size.equals("")) {
            setNumberOfToppings(numberOfToppings);
        }
    }


    public double calculatePrice() {
        double finalPrice = 0;
        switch (size) {
            case "small":
                finalPrice +=4;
                break;
            case "medium":
                finalPrice +=6;
                break;
            case "large":
                finalPrice +=8;
                break;
        }
        return finalPrice += numberOfToppings * 0.75;
    }

    @Override
    public String toString() {

        if (this.size.equals("")) {
            return "Not valid pizza size";
        }
        return "Pizza {" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                ", price=" + calculatePrice() +
                '}';
    }
}