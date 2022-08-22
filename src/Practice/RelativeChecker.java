package Practice;

public class RelativeChecker {
    public static void main(String[] args) {



    /*
    Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related

    -------------------

    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
     */
    String name1 = "James Bond ";//nexLine()
    String name2 = "Jamie Bond";//nextLine()

    int indexOfSpace = name1.lastIndexOf(' ');
    String lastName = name1.substring(indexOfSpace + 1); // name1.substring(indexOfSpace).trim();

        if(name2.endsWith(lastName)){
            System.out.println("Related");
        }else{
            System.out.println("Not related");
        }
        System.out.println(name2.endsWith(lastName)? "Related": "Not related" );
}    }
