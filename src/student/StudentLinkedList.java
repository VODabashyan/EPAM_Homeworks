package student;

import java.util.Iterator;

public class StudentLinkedList implements Iterable<Student> {
    private StudentNode head;
    private StudentNode tail;
    private int listSize = 0;

    private class StudentNode {
        Student student;
        StudentNode next;
        StudentNode previous;

        public StudentNode(Student student, StudentNode next, StudentNode previous) {
            this.student = student;
            this.next = next;
            this.previous = previous;
        }

        public Student getStudent() {
            return student;
        }

        public StudentNode getNext() {
            return next;
        }
    }

    public void push(Student student) {
        StudentNode newNode = new StudentNode(student, head, null);
        StudentNode temp;
        if (head != null) {
            head.previous = newNode;
            head = newNode;
        } else {
            newNode.next = null;
            head = newNode;
            tail = newNode;
        }
        listSize++;
    }

    public Student pop() {
        StudentNode removed = null;
        if (head != null) {
            if (head != tail) {
                removed = head;
                head = head.next;
                head.previous = null;
            } else {
                removed = head;
                head = tail = null;
            }
            listSize--;
            return removed.getStudent();
        } else {
            return null;
        }
    }

    public boolean addLast(Student student) {
        StudentNode newNode = new StudentNode(student, null, tail);
        StudentNode temp;

        if (tail != null) {
            tail.next = newNode;
            tail = newNode;
        } else {
            newNode.previous = null;
            tail = newNode;
            head = newNode;
        }
        listSize++;
        return true;
    }

    public Student removeLast() {
        StudentNode removed = null;
        if (tail != null) {
            if (tail != head) {
                removed = tail;
                tail = tail.previous;
                tail.next = null;
            } else {
                removed = tail;
                tail = head = null;
            }
            listSize--;
            return removed.getStudent();
        } else {
            return null;
        }
    }

    public int size() {
        return listSize;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentLinkedListIterator();
    }

    private class StudentLinkedListIterator implements Iterator<Student> {
        StudentNode current = null;

        @Override
        public boolean hasNext() {
            if (current == null && head != null) {
                return true;
            } else if (current != null) {
                return current.getNext() != null;
            }
            return false;
        }

        @Override
        public Student next() {
            if (current == null && head != null) {
                current = head;
                return head.getStudent();
            } else if (current != null) {
                current = current.getNext();
                return current.getStudent();
            }
            return null;
        }
    }
}

