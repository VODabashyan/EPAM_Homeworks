package university;

import university.exceptions.NullCourseException;

public class Student {
    private String studentId;
    private String name;
    private String surname;
    private String email;
    private Course[] courses;
    private Grade[] grades;

    public Student(String studentId, String name, String surname, Course[] courses, Grade[] grades) throws NullCourseException {
        setStudentId(studentId);
        setName(name);
        setSurname(surname);
        setCourses(courses);
        setGrades(grades);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) throws NullCourseException {
        if(courses.length == 0) {
            throw new NullCourseException();
        }
        this.courses = courses;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }
}
