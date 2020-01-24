package student;

public class StudentListInitializerAndPrinter {
    Student[] list;
    StudentArrayList arrayList = new StudentArrayList();
    StudentLinkedList linkedList = new StudentLinkedList();

    public StudentListInitializerAndPrinter(Student[] list) {
        this.list = list;
    }

    public void initializeList() {
        for (int i = 0; i < list.length; i++) {
            arrayList.add(list[i]);
            linkedList.addLast(list[i]);
        }
    }

    public void printList() {
        System.out.println("The students in the StudentArrayList are: ");
        for (Student student : arrayList) {
            System.out.println(student);
        }

        System.out.println("\nThe students in the StudentLinkedList are: ");
        for (Student student : linkedList) {
            System.out.println(student);
        }
    }
}

