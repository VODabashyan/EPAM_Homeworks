package university.averageCalculator;

import university.*;

public class CourseFacultyAverage implements Average {
    private Faculty faculty;
    private String courseName;
    private double average = 0;

    public CourseFacultyAverage(Faculty faculty, String courseName) {
        this.faculty = faculty;
        this.courseName = courseName;
    }

    @Override
    public double getAverage() {
        double gradeSum = 0;
        Group[] groups = faculty.getGroupNames();
        int groupCount = 0;
        double groupAverageGrade;

        for (int i = 0; i < groups.length; i++) {
            CourseGroupAverage cga = new CourseGroupAverage(groups[i], courseName);
            groupAverageGrade = cga.getAverage();
            gradeSum += groupAverageGrade;
            groupCount++;
        }

        average = gradeSum / groupCount;
        //System.out.println("The average grade from " + courseName + " for the faculty " + faculty.getFacultyName() + " is: " + average);
        return average;
    }
}
