
//The this keyword refers to the current object of the current class.

//Whenever you create an object, this refers to that object.



class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class This_keyword{
    public static void main(String[] args) {
        Student s = new Student("Harish");
        s.display();
    }
}