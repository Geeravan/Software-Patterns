package Excercise_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSorter implements Sorter{
    public List<Student> sort(List<Student> list){
        List<Student> students = new ArrayList<>(list);
        students.sort(Comparator.comparing(Student::getNames));
        return students;
    }
}




