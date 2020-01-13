package university;

import university.exceptions.NullCourseException;

public class Student {
    private String studentId;
    private String name;
    private String surname;
    private String email;
    private Course[] courses;
    private Grade[] grades;

    public Student(StudentBuilder sb) {
        studentId = sb.studentId;
        name = sb.name;
        surname = sb.surname;
        courses = sb.courses;
        grades = sb.grades;
    }

    public static class StudentBuilder {
        private String studentId;
        private String name;
        private String surname;
        private String email;
        private Course[] courses;
        private Grade[] grades;

        public StudentBuilder studentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public StudentBuilder email(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder courses(Course[] courses) {
            this.courses = courses;
            return this;
        }

        public StudentBuilder grades(Grade[] grades) {
            this.grades = grades;
            return this;
        }

        public Student build() throws NullCourseException {
            if (courses.length == 0) {
                throw new NullCourseException();
            }
            Student student = new Student(this);
            return student;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Grade[] getGrades() {
        return grades;
    }
}
