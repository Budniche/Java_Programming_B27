package day13_switch_string;

public class Elevator {
    public static void main(String[] args) {
        int floor = 7;
        String companies;

        switch (floor) {
            default://defined anywhere in the swith, but it will be the case executed if no other case matches
                companies = "Invalid Floor Selected";
                break;
            case 1:
                companies = "Lobby, StarBucks, Amazon Pick up";
                break;// stops the switch
            case 2:
                companies = "NASA, Cydeo, Discover";
                break;
            case 3:
                companies = "Uber, Lift, Chase";
                break;// stops the switch
            case 4:
                companies = "Rooftop, Lounge";
                break;
        }
        System.out.println("Floor " + floor + ":" + companies);

    }
}
