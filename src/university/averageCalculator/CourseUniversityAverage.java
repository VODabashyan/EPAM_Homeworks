package university.averageCalculator;

import university.Faculty;
import university.University;

public class CourseUniversityAverage implements Average{
    private University university;
    private String courseName;
    private double average = 0;

    public CourseUniversityAverage(University university, String courseName) {
        this.university = university;
        this.courseName = courseName;
    }


    @Override
    public double getAverage() {
        double gradeSum = 0;
        Faculty[] faculties = university.getFaculties();
        int facultyCount = 0;
        double facultyAverageGrade;

        for (int i = 0; i < faculties.length; i++) {
            CourseFacultyAverage cfa = new CourseFacultyAverage(faculties[i], courseName);
            facultyAverageGrade = cfa.getAverage();
            gradeSum += facultyAverageGrade;
            facultyCount++;
        }

        average = gradeSum / facultyCount;

        return average;
    }
}
