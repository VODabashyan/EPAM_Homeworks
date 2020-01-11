package university;

import university.exceptions.GradeValueException;

public class Grade {
    private double studentGrade;

    public Grade(double studentGrade) throws GradeValueException {
        setStudentGrade(studentGrade);
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) throws GradeValueException {
        if (studentGrade < 0 || studentGrade > 10) {
            throw new GradeValueException();
        }
        this.studentGrade = studentGrade;
    }
}
