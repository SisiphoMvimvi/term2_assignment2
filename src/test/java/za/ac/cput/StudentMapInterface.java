package za.ac.cput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentMapInterface {

        Map<Integer, String> studentMap = new HashMap<>();

        public void put(String name) {
            studentMap.put(1, name);
        }

        public void remove(String name) {
            studentMap.remove(name);
        }

        public int sizeOfStudent() {
            return studentMap.size();
        }



    }



