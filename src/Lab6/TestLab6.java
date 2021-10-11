package Lab6;
import java.util.Arrays;
public class TestLab6 {
    public static void main(String[] agrs){
        Student student = new Student(11,"Kim");
        student.bubbleSort();
        System.out.println(Arrays.toString(student.IDNumber));

        Student[] spisok = new Student[6];
        spisok[0]=new Student(74,"Pavel");
        spisok[1]=new Student(90,"Sasha");
        spisok[2]=new Student(15,"Masha");
        spisok[3]=new Student(21,"Dasha");
        spisok[4]=new Student(44,"Natasha");
        spisok[5]=new Student(2,"Katya");

        int[] x = {39,39,999,11,0,-2};
        String[] strs = {"sdfsdf","3333","aaaa"};
        Arrays.sort(x);
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        Arrays.sort(spisok, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(spisok));

        Student[] spisok2 = new Student[4];
        spisok2[0]=new Student(33,"Gera");
        spisok2[1]=new Student(12,"Manya");
        spisok2[2]=new Student(19,"Vanya");
        spisok2[3]=new Student(98,"Tanya");

        Student[] allspisok = new Student[10];

        System.arraycopy(spisok,0,allspisok,0,spisok.length);
        System.arraycopy(spisok2,0,allspisok,spisok.length,spisok2.length);
        Arrays.sort(allspisok,new SortingStudentsByGPA());
        System.out.println(Arrays.toString(allspisok));


    }
}
