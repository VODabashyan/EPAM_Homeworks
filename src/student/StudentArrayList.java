package student;

import java.util.Iterator;

public class StudentArrayList implements Iterable<Student> {
    private int capacity;
    private int arraySize;
    private Student[] students;

    public StudentArrayList() {
        capacity = 10;
        arraySize = 0;
        students = new Student[capacity];
    }

    public boolean add(Student s) {
        if (arraySize == capacity) {
            int newSize = arraySize * 2;
            Student[] tempStudents = new Student[newSize];
            for (int i = 0; i < students.length; i++) {
                tempStudents[i] = students[i];
            }
            students = tempStudents;
        }

        students[arraySize] = s;
        arraySize++;
        return true;
    }

    public boolean remove(Student s) {
        int matchedElementIndex = 0;
        if (arraySize != 0) {
            for (int i = 0; i < arraySize; i++) {
                if (students[i] == s) {
                    matchedElementIndex = i;
                    students[i] = null;
                    break;
                }

            }

            for (int j = matchedElementIndex; j < arraySize - 1; j++) {
                students[j] = students[j + 1];
                students[arraySize - 1] = null;
            }
            arraySize--;
            return true;
        } else {
            return false;
        }
    }

    private void shift(int index) {
        Student[] students = new Student[capacity];

        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        students[students.length - 1] = null;
    }


    public int size() {
        return arraySize;
    }

    public Student get(int index) {
        if (students[index] != null) {
            return students[index];
        } else {
            return null;
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentArrayListIterator();
    }

    private class StudentArrayListIterator implements Iterator<Student> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < students.length && students[current] != null;
        }

        @Override
        public Student next() {
            return students[current++];
        }
    }
}

