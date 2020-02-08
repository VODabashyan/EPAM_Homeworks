package customset;

import customset.types.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ann", "Smith", 30);
        Student s2 = new Student("Derek", "Levine", 19);
        Student s3 = new Student("Sue", "Jordan", 50);
        Student s4 = new Student("Bill", "Gates", 64);
        Student s5 = new Student("Mark", "Stone", 29);
        Student s6 = new Student("Bill", "Gates", 64);

        CustomSet<Student> studentSet = new CustomSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);

        studentSet.printTree();
        System.out.println("The size is " + studentSet.getSize());
        String result = studentSet.contains(s3) ? "YES" : "NO";
        System.out.println("Does the set contain the student " + s3.toString() + "? " + result);

    }
}
