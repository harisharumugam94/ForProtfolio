//Abstraction is the process which hide the how it work or implement and show what it do.
//there are two types of abstraction class:
    //i)abstract class
    //ii)interface class

//An abstract class is a class that cannot be instantiated (you cannot create an object of it).
//It is used as a base (parent) class for other classes.|
//It contain both normal and abstract method.

abstract class animal{
    abstract void sound();//abstract method no need body

    void eat()// normal method
    {
        System.out.println("the animal is eating");

    }
}

class dog extends animal{
    void sound()
    {

        System.out.println("the dog is barking");
    }
}
public class Abstraction {
    public static void main(String[] args){
        animal d1= new dog();

        d1.eat();
        d1.sound();

    }
    
}