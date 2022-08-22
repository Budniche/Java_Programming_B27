package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate1 {


    public static void main(String[] args) {

        ArrayList<Integer>  list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(list1);

        System.out.println(removeDuplicate1(list1));

    }


    public static ArrayList<Integer> removeDuplicate1(ArrayList<Integer> list) {

        ArrayList<Integer>  listUnique = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            boolean isDuplicate = false;
            for (int j = 0; j < list.size(); j++) {


                if (i != j && list.get(i) == list.get(j)) {
               isDuplicate = true;
                    break;
                }
                if(!isDuplicate){
                    listUnique.add(list.get(i));
                }
            }
        }
        list.removeAll(listUnique);
        return list;
    }

}
