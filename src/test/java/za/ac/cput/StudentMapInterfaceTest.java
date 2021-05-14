package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapInterfaceTest {

    Map<Integer, String> studentMap = new HashMap<>();

    @Test
    public void testAdd(){
        studentMap.put(1, "Coding");
        studentMap.put(2, "Is");
        studentMap.put(3, "Giving");
        studentMap.put(4, "Headache");
        System.out.println(studentMap);
        assertEquals(4, studentMap.size());
    }

    @Test
     public void testRemove(){
        studentMap.put(1, "Coding");
        studentMap.put(2, "Is");
        studentMap.put(3, "Giving");
        studentMap.put(4, "Headache");

        studentMap.remove(2);
        System.out.println(studentMap);
        assertEquals(4, studentMap.size());

    }

    @Test
    public void testFind(){
        studentMap.put(1, "Coding");
        studentMap.put(2, "Is");
        studentMap.put(3, "Giving");
        studentMap.put(4, "Headache");

        studentMap.containsKey(1);
        System.out.println(studentMap);
        assertEquals(4, studentMap.size());
    }

}