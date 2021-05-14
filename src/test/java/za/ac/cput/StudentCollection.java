package za.ac.cput;

import java.util.ArrayList;
import java.util.Collection;

public class StudentCollection {

    private Collection<String> studentCollection = new ArrayList<>();

            public void add(String name) {
                studentCollection.add(name);
            }

            public void remove(String name) {
                studentCollection.remove(name);
            }

           public void contains(String name){
                studentCollection.contains(name);
    }




}
