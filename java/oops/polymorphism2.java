

//method overriding  is the ability to define the same method name with different parameter in the parent and child class.
public class polymorphism2{
    public static void main(String[] args){

        animal a1= new animal();
        a1.sound();// return animal sound method
        animal a2 = new dogs();
        a2.sound();// return dogs sound method
        dogs a3 = new dogs();
        a3.sound();// return dogs sound method
       // we cant create the object of the child class using the parent class object (new animal();) 
    }
}


class animal{
    void sound(){
        System.out.println("animal makes sound");
    }
}

class dogs extends animal{
    @Override
    void sound(){
        System.out.println("dogs bark");
    }
}

