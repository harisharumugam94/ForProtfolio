//The super keyword in Java is used to refer to the parent class (superclass).
//It is mainly used for 3 purposes:

//To call the parent class variable.
//To call the parent class method.
//To call the parent class constructor.



class parent{
    int var=100000;
    
    void mome(){
        System.out.println("i am father");
    }
    parent(){
        System.out.println("system");
    }
}
class child extends parent{
    void display(){
        System.out.println(super.var);
        super.mome();
    
    }
}



public class superdemo{
    public static void main(String[] args){
        child c = new child();
        c.display();
    }
}
