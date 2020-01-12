package university.averageCalculator;

import university.*;

public class TotalAverage implements Average {
    private Student student;
    private double average = 0;


    public TotalAverage(Student student) {
        this.student = student;
    }

    @Override
    public double getAverage() {
        double gradesSum = 0;
        Grade[] totalGrades = student.getGrades();
        for (int i = 0; i < totalGrades.length; i++) {
            gradesSum += totalGrades[i].getStudentGrade();
        }
        average = gradesSum / totalGrades.length;
        return average;
    }
}
