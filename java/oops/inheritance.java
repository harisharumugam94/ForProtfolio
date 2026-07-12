//inheritance is the process where one class aquires tthe properties and behaviors of another class.
//  The class which inheritance is call parent class or super class and the class which in the inheriretance is called chilld class or sub class.
// sigle inheritance is the process where one class inherits the properties and the behaviors of another class.This inheriancew is single level inheritance.


public class Inheritance{
    public static void main(String[] args){

        child c1= new child();
        System.out.println("money: "+c1.money);
        System.out.println("car: "+c1.car);
        System.out.println("house: "+c1.house);
        System.out.println("mobile: "+c1.mobile);
        System.out.println("bike: "+c1.bike);
    }
}
class parent{     //parent class or super class
    int money=10000;
    int car=1;
    int house=1;
}

class child extends parent{ // child class or sub class
    int mobile=1;
    int bike=1;
}

