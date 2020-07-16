package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 70));
        studentList.add(new Student("Bob", 23));
        studentList.add(new Student("Who", 90));

        System.out.println(studentList);

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getScore(), s2.getScore());
            }
        });

        System.out.println(studentList);
    }
}
