package Lab6;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getBall()-o1.getBall();
    }

}

