//A constructor is a special method that is automatically called when an object is created. 
// It is mainly used to initialize (give values to) the object's variables.

public class constructor {
    
    int rollno;
    String name;
    constructor( int a, String b){
        rollno = a;
        name = b;
        System.out.println("The name "+name+"\nThe rollno "+rollno);
    

    }
    public static void main(String[] args){

        constructor c = new constructor(55, "harish"); 
        
    }
}
