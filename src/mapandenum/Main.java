package mapandenum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Diana", "Asatryan", 22, "0988111111", "Math");
        Student s2 = new Student("Diana", "Asatryan", 32, "0922111111", "Physics");
        Student s3 = new Student("Diana", "Asatryan", 21, "0938111111", "Philosophy");
        Student s4 = new Student("Karen", "Balayan", 12, "097777777", "Math");
        Student s5 = new Student("Karen", "Balayan", 23, "0988111111", "Philosophy");
        Student s6 = new Student("Elen", "Mirzoyan", 12, "093333333", "English");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);


        for(String key: getStudentsMap(students).keySet()) {
            int value = getStudentsMap(students).get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println();

        getFacultyStudentsCount(students, "Philosophy");
        getFacultyStudentsCount(students, "Math");
        getFacultyStudentsCount(students, "English");
        getFacultyStudentsCount(students, "CIS");
        System.out.println();
    }

    static Map<String, Integer> getStudentsMap(List<Student> students) {
        HashMap<String, Integer> studentsMap = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            String key = students.get(i).toString();
            int count = 1;
            if (studentsMap.containsKey(key)) {
                count = studentsMap.get(key) + 1;
            }
            studentsMap.put(key, count);
        }
        return studentsMap;
    }

    static void getFacultyStudentsCount(List<Student> students, String faculty) {
        int studentCount = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getFaculty() == faculty) {
                studentCount++;
            }
        }

        if(studentCount == 0) {
            System.out.println("No student studies " + faculty);
        } else if(studentCount == 1)
        System.out.println(studentCount + " student studies " + faculty);
        else{
            System.out.println(studentCount + " students study " + faculty);
        }
    }
}
