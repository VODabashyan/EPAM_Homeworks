package university;

import university.averageCalculator.Average;
import university.averageCalculator.CourseGroupAverage;
import university.averageCalculator.TotalAverage;
import university.exceptions.*;

public class Main {
    public static void main(String[] args) {
        Course cs120 = new Course("CS 120", "Intro to OOP");
        Course cs121 = new Course("CS 121", "Data Structures");
        Course cs311 = new Course("CS 311", "Theory of Algorithms");
        Course cs323 = new Course("CS 323", "Advanced OOP");
        Course iesm360 = new Course("IESM 360", "Computer-Aided Design");
        Course iesm315 = new Course("IESM 315", "Design and Analysis of Experiments");
        Course iesm347 = new Course("IESM 347", "Design and Innovation of Information Services");
        Course iesm362 = new Course("IESM 362", "Advanced CAD/CAM Applications");

        try {
            Student student1 = new Student("s1", "Mark", "Miller", new Course[]{cs120, cs121, cs311}, new Grade[]{new Grade(9.7), new Grade(8), new Grade(7)});
            Student student2 = new Student("s2", "James", "Thomson", new Course[]{cs121, cs311, cs323}, new Grade[]{new Grade(5), new Grade(9.5), new Grade(6)});
            Student student3 = new Student("s3", "Blake", "Shelton", new Course[]{cs120, cs121, cs311}, new Grade[]{new Grade(9.7), new Grade(7.7), new Grade(7)});
            Student student4 = new Student("s4", "James", "Thomson", new Course[]{cs121, cs311, cs323}, new Grade[]{new Grade(9.8), new Grade(7.5), new Grade(8)});
            Student student5 = new Student("s5", "Adam", "Levine", new Course[]{cs120, cs121, cs311, cs323}, new Grade[]{new Grade(9.7), new Grade(8), new Grade(7), new Grade(9.7)});
            Student student6 = new Student("s6", "Roy", "Jones", new Course[]{cs120, cs121, cs311, cs323}, new Grade[]{new Grade(8.6), new Grade(6), new Grade(5.5), new Grade(10)});
            Student student7 = new Student("s7", "Ann", "Stone", new Course[]{iesm360, iesm315, iesm347}, new Grade[]{new Grade(8.5), new Grade(9), new Grade(7.4)});
            Student student8 = new Student("s8", "Karma", "Lee", new Course[]{cs120, iesm315, iesm347, iesm362}, new Grade[]{new Grade(5.5), new Grade(6.5), new Grade(7.5), new Grade(6.5)});
            Student student9 = new Student("s9", "Tom", "Ford", new Course[]{iesm360, iesm315, iesm347}, new Grade[]{new Grade(9), new Grade(8.8), new Grade(10)});
            Student student10 = new Student("s10", "Serena", "Williams", new Course[]{iesm360, iesm315, iesm347, iesm362}, new Grade[]{new Grade(8), new Grade(7.5), new Grade(9.5), new Grade(10)});
            Student student11 = new Student("s11", "Madison", "Keys", new Course[]{cs120, iesm360, iesm315, iesm347, iesm362}, new Grade[]{new Grade(7), new Grade(10), new Grade(8), new Grade(9.5), new Grade(8.5)});
            Student student12 = new Student("s12", "Sloane", "Stephens", new Course[]{iesm360, iesm315, iesm347, iesm362}, new Grade[]{new Grade(9.5), new Grade(10), new Grade(8), new Grade(10)});

            Group group1 = new Group("Software Engineering", new Student[]{student1, student2, student3, student4});
            Group group2 = new Group("Theoretical CS", new Student[]{student5, student6});
            Group group3 = new Group("Applied IESM", new Student[]{student7, student8, student9});
            Group group4 = new Group("Theoretical IESM", new Student[]{student10, student11, student12});

            Faculty faculty1 = new Faculty("CIS", new Group[]{group1, group2});
            Faculty faculty2 = new Faculty("IESM", new Group[]{group3, group4});

            University aua = new University("AUA", "40 Marshal Baghramyan Ave, Yerevan, Armenia", "www.aua.am", "(010) 324040", new Faculty[]{faculty1, faculty2});
            System.out.println(aua);


            Average studentAverage = new TotalAverage(student1);
            System.out.println("The Total average grade of " + student1.getName() + " " + student1.getSurname() + " is: " + studentAverage.getAverage());

            Average groupGradeAverage = new CourseGroupAverage(group1, "Intro to OOP");
            System.out.println("The average grade from Intro to OOP for the group " + group1.getName() + " is: " + groupGradeAverage.getAverage());

        } catch (NullCourseException | GradeValueException | NullStudentException | NullGroupException | NullFacultyException e) {
            e.printStackTrace();
        }
    }
}
