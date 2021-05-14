package za.ac.cput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentSetInterface extends StudentCollection {

        Set<String> studentSet = new HashSet<>();
        public void add(String name) {
            studentSet.add(name);
        }

        public void remove(String name) {
            studentSet.remove(name);
        }

        public int sizeOfStudent() {
            return studentSet.size();
        }
}
