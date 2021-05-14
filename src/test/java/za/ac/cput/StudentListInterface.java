package za.ac.cput;

import java.util.ArrayList;
import java.util.List;

public class StudentListInterface{

        List<String> studentList = new ArrayList<String>();

        public void add(String name) {
            studentList.add(name);
        }

        public void remove(String name) {
            studentList.remove(name);
        }

        public void contains(String name) {
            studentList.contains(name);
        }

    }