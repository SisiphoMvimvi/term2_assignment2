package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class StudentCollectionTest {

    Collection<String> studentCollection = new ArrayList<>();

    @Test
    void testAdd(){
        studentCollection.add("Coding");
        studentCollection.add("Is");
        studentCollection.add("Giving");
        studentCollection.add("Headache");
        System.out.println("Four Names added: " + studentCollection);
        assertEquals( 4, studentCollection.size());

    }
    @Test
    void testRemove(){
        studentCollection.add("Coding");
        studentCollection.add("Sweet");
        studentCollection.remove("Sweet");
        System.out.println("Name Removed: " + studentCollection);
        assertEquals(1, studentCollection.size());
    }
    @Test
    void testFind(){
        studentCollection.add("Coding");
        studentCollection.add("Gives");

        System.out.println("Name Found"+ studentCollection.getClass());
       
    }

}