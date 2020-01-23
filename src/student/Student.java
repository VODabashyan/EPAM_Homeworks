package student;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Student student1) {
        return lastName.compareTo(student1.lastName);//as Strings are naturally ordered in ascending order then we can use 'compareTo()' method of String.
    }
}
