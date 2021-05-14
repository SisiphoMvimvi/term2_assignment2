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
        System.out.println(studentSet);
        assertEquals( 4, studentSet.size());
    }

    @Test
    public void testRemove(){
        studentSet.add("Coding");
        studentSet.add("Sweet");
        studentSet.remove("Sweet");
        System.out.println(studentSet);
        assertEquals( 1, studentSet.size());
    }
    @Test
    public void testFind(){
        studentSet.add("Coding");
        studentSet.add("Sweet");
        studentSet.contains("Sweet");
        System.out.println(studentSet);
        assertEquals( 1, studentSet.size());
    }

}