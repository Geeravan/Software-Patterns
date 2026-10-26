package Excercise_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1003, "Charlie"));
        students.add(new Student(1001, "Bob"));
        students.add(new Student(1002, "Alice"));

        Sorter numberSorter = new NumberSorter();
        Sorter nameSorter = new NameSorter();

        System.out.println("Nach Matrikelnummer: " + numberSorter.sort(students));
        System.out.println("Nach Name: " + nameSorter.sort(students));
    }
}