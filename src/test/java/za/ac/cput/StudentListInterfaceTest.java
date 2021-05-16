package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentListInterfaceTest {

    List<String> studentList = new ArrayList<String>();


    @Test
    public void testAdd() {

        studentList.add("Coding");
        studentList.add("Is");
        studentList.add("Giving");
        studentList.add("Headache");
        System.out.println("Four Names added: " +studentList);
        assertEquals(4, studentList.size());

}
    @Test
    public void testRemove(){

        studentList.add("Coding");
        studentList.add("Sweet");
        studentList.remove("Sweet");
        System.out.println("Sweet Removed: " +studentList);
        assertEquals(1, studentList.size());
    }

    @Test
    public void testFind(){

        studentList.add("Coding");
        studentList.add("Sweet");

        studentList.contains("Coding");
        System.out.println("Name Found: "+ studentList.contains("Coding"));


    }}
