//Encapsulation means wrapping data (variables) and methods (functions) into a single unit (class) and hiding the data from direct access.
//Access modifier control who can access the constructor, class , data and methods.
//Access modifier are : private public protected and default


// public can be accessed from anywhere in the program.
//private can be accessed only within the class.
//protected can be accessed within the same package and childclass from different package but cannot access in different package.
//default can be accessed only within the same package.  

public class encapsulation{
    public int num;
    public String name;
    private int age;
    protected String role;
    String filter;

    public static void main(String[] args){
        encapsulation e = new encapsulation();
        e.num=10;
        e.name="John";
        e.age=30;
        e.role="Developer";
        e.filter="java";
        System.out.println("The number is: "+e.num); //this is public access modifier.
        System.out.println("The name is: "+e.name); //this is public access modifier.
        System.out.println("the age is: "+e.age); //this is private access modifier.
        System.out.println("The role is: "+e.role); //this is protected access modifier.
        System.out.println("The filter is: "+e.filter); //this is default access modifier.
       
    }
}
