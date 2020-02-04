package university.averageCalculator;

import university.*;

public class CourseGroupAverage implements Average {
    private Group group;
    private String courseName;
    private double average = 0;

    public CourseGroupAverage(Group group, String courseName) {
        this.group = group;
        this.courseName = courseName;
    }

    @Override
    public double getAverage() {
        double gradeSum = 0;
        Student[] students = group.getStudents();
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            Course[] courses = students[i].getCourses();
            Grade[] grades = students[i].getGrades();
            for (int j = 0; j < courses.length; j++) {
                if (courseName.equals(courses[j].getCourseName())) {
                    gradeSum += grades[j].getStudentGrade();
                    count++;
                }
            }
        }
        average = gradeSum / count;
        return average;
    }
}
