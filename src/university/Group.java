package university;

import university.exceptions.NullStudentException;

public class Group {
    private String name;
    public static final int CAPACITY = 20;
    private Student[] students;

    public Group(String name, Student[] students) throws NullStudentException {
        setName(name);
        setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) throws NullStudentException {
        if (students.length == 0) {
            throw new NullStudentException();
        } else if (students.length > CAPACITY) {
            System.err.println("The number of students exceeds the group capacity!");
            return;
        }
        this.students = students;
    }
}
