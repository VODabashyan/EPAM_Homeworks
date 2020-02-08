package customset;

import customset.types.Coffee;
import customset.types.Glasses;
import customset.types.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ann", "Smith", 30);
        Student s2 = new Student("Derek", "Levine", 19);
        Student s3 = new Student("Sue", "Jordan", 50);
        Student s4 = new Student("Bill", "Gates", 64);
        Student s5 = new Student("Mark", "Stone", 29);
        Student s6 = new Student("Bill", "Gates", 64);

        CustomSet<Student> studentSet = new CustomSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);

        studentSet.printTree();
        System.out.println("The size is " + studentSet.getSize());
        String result = studentSet.contains(s3) ? "YES" : "NO";
        System.out.println("Does the set contain the student " + s3.toString() + "? " + result + "\n");

        studentSet.remove(s3);
        System.out.println("The students present in the set after deletion are: ");
        studentSet.printTree();
        System.out.println("The size after deletion is: " + studentSet.getSize());
        String result2 = studentSet.contains(s3) ? "YES" : "NO";
        System.out.println("Does the set contain the student " + s3.toString() + "? " + result2 + "\n");

        System.out.println("\n/*************Coffee**************/\n");

        Coffee c1 = new Coffee("Arabica", 3.46);
        Coffee c2 = new Coffee("Robusta", 1.63);
        Coffee c3 = new Coffee("Liberica", 1.52);
        Coffee c4 = new Coffee("Excelsa", 2.23);
        Coffee c5 = new Coffee("Typica", 4.50);
        Coffee c6 = new Coffee("Bourbon", 2.70);
        Coffee c7 = new Coffee("Robusta", 1.63);

        CustomSet<Coffee> coffeeSet = new CustomSet<>();
        coffeeSet.add(c1);
        coffeeSet.add(c2);
        coffeeSet.add(c3);
        coffeeSet.add(c4);
        coffeeSet.add(c5);
        coffeeSet.add(c6);
        coffeeSet.add(c7);

        coffeeSet.printTree();
        System.out.println("The size is " + coffeeSet.getSize());
        String result3 = coffeeSet.contains(c5) ? "YES" : "NO";
        System.out.println("Does the set contain the coffee type " + c5.getType() + "? " + result3 + "\n");

        coffeeSet.remove(c5);
        coffeeSet.remove(c3);
        System.out.println("The coffee types present in the set after deletion are: ");
        coffeeSet.printTree();
        System.out.println("The size after deletion is: " + coffeeSet.getSize());
        String result4 = coffeeSet.contains(c3) ? "YES" : "NO";
        System.out.println("Does the set contain the coffee type " + c3.getType() + "? " + result4 + "\n");

        System.out.println("\n/*************Glasses**************/\n");

        Glasses g1 = new Glasses("Dior", "Sunglasses");
        Glasses g2 = new Glasses("Ottoto", "Corrective");
        Glasses g3 = new Glasses("Pyramex", "Safety");
        Glasses g4 = new Glasses("Lacoste", "Sunglasses");
        Glasses g5 = new Glasses("Dior", "Sunglasses");

        CustomSet<Glasses> glassesSet = new CustomSet<>();
        glassesSet.add(g1);
        glassesSet.add(g2);
        glassesSet.add(g3);
        glassesSet.add(g4);
        glassesSet.add(g5);


        glassesSet.printTree();
        System.out.println("The size is " + glassesSet.getSize());
        String result5 = glassesSet.contains(g4) ? "YES" : "NO";
        System.out.println("Does the set contain the glasses " + g4.toString() + "? " + result5 + "\n");

        glassesSet.remove(g4);
        System.out.println("The glasses present in the set after deletion are: ");
        glassesSet.printTree();
        System.out.println("The size after deletion is: " + glassesSet.getSize());
        String result6 = glassesSet.contains(g4) ? "YES" : "NO";
        System.out.println("Does the set contain the glasses " + g4.toString() + "? " + result6 + "\n");
    }
}
