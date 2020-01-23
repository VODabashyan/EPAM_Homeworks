package student;

import student.comparator.StudentAgeComparator;
import student.comparator.StudentFirstNameComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{ new Student("Mark", "Thomson", 24),
                new Student("Ann", "Smith", 30),
                new Student("Derek", "Levine", 19),
                new Student("Sue", "Jordan", 50),
                new Student("Bill", "Marley", 40),
                new Student("Mark", "Stone", 29),
                new Student("Bill", "Gates", 64) };

        List<Student> ArrayListOfStudents = new ArrayList<Student>(Arrays.asList(students));

        System.out.println("The order of students before sorting");
        Student.printList(ArrayListOfStudents);
        System.out.println();

        System.out.println("The order of students after sorting");
        Collections.sort(ArrayListOfStudents, new StudentFirstNameComparator().thenComparing(new StudentAgeComparator()));
        Student.printList(ArrayListOfStudents);
        System.out.println();

        System.out.println("Students ordered by the natural order of the Student class");
        List<Student> LinkedListOfStudents = new LinkedList<>(Arrays.asList(students));
        Collections.sort(LinkedListOfStudents);
        Student.printList(LinkedListOfStudents);

    }
}
