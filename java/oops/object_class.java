//OOPS (Object-Oriented Programming System) is a programming paradigm that organizes software around objects rather than functions.
//  An object is an instance of a class that contains both data (attributes) and methods (functions).
//The class is the blueprint for creating the objects. It defines the properties and behaviors that the object will have.


public class object_class//class
 {
    String name;
    int age;
    String role;

    public static void main(String[] args){
        object_class oc=new object_class();// object
        oc.name="John";
        oc.age=30;
        oc.role="Developer";
        System.out.println("The name:"+ oc.name);
        System.out.println("The age:"+ oc.age);
        System.out.println("The role:"+ oc.role);

    }
}
