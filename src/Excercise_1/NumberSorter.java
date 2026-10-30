package Excercise_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class NumberSorter implements Sorter{

    @Override
    public List<Student> sort(List<Student> list) {
        List<Student> students = new ArrayList<>(list);
        students.sort(Comparator.comparingInt(Student::getMatriculationNumber));
        return students;
    }
}
