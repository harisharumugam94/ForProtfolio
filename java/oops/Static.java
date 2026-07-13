class Student {

    // Static Variable
    static String college = "ABC Engineering College";

    // Instance Variable
    String name;

    // Static Block
    static {
        System.out.println("Static Block Executed");
        System.out.println("College Initialized");
    }

    // Constructor
    Student(String name) {
        this.name = name;
    }

    // Static Method
    static void collegeInfo() {
        System.out.println("College Name: " + college);
    }

    // Non-static Method
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("College: " + college);
    }
}
public class Static {
     public static void main(String[] args) {

        // Calling Static Method
        Student.collegeInfo();

        System.out.println();

        // Creating Objects
        Student s1 = new Student("Harish");
        Student s2 = new Student("Rahul");

        // Calling Non-static Method
        s1.display();

        System.out.println();

        s2.display();
    }
    
}
