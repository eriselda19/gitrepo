package src.CollectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtility {
    public static void main(String[] args) {
        List<String> listOfStrings =new ArrayList<>();
        listOfStrings.add("Lex");
        listOfStrings.add("Steven");
        listOfStrings.add("John");
        listOfStrings.add("Eriselda");
        listOfStrings.add("Esmeralda");

        System.out.println("Before sorting");

        for(String name:listOfStrings){
            System.out.println(name + " ");
        }

        Collections.sort(listOfStrings);
//        System.out.println("");
        System.out.println("After sorting - Asc");
        for(String name:listOfStrings){
            System.out.println(name + " ");
        }

        Collections.reverse(listOfStrings);
//        System.out.println("");
        System.out.println("After sorting - Desc");
        for(String name:listOfStrings){
            System.out.println(name + " ");
        }



    }
}
