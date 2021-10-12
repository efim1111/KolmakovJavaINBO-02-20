package Lab9.ex2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Сидоров1", 67, 12, 18));
        s.add(new Student("Сидоров2", 57, 12, 18));
        s.add(new Student("Сидоров3", 93, 12, 19));
        s.add(new Student("Сидоров4", 24, 2, 18));
        s.add(new Student("Сидоров5", 66, 12, 18));

        new LabClassUI(s);
    }

}
