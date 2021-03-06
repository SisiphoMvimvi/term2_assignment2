package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentSetInterfaceTest {

    Set<String> studentSet = new HashSet<>();

    @Test
    public void testAdd(){
        studentSet.add("Coding");
        studentSet.add("Is");
        studentSet.add("Giving");
        studentSet.add("Headache");
        System.out.println("Four names added:" +studentSet);
        assertEquals( 4, studentSet.size());
    }

    @Test
    public void testRemove(){
        studentSet.add("Coding");
        studentSet.add("Sweet");
        studentSet.remove("Sweet");
        System.out.println("Removed Sweet:" +studentSet);
        assertEquals( 1, studentSet.size());
    }
    @Test
    public void testFind(){
        studentSet.add("Coding");
        studentSet.add("Sweet");
       studentSet.contains("Coding");
        System.out.println("Found Coding: " +studentSet.contains("Coding"));

    }

}