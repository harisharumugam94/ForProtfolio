//multilevel inheritance is the process where one class inherits the properties and behaviors of another class and the another class inherits the properties and behaviors of the other class.
// It like the chian of inheritance where one class is grandparent class and the other class is the parent class and the another class is the child class. 


class grandparent{
    int land=3;
    String asset="gold";

}
class parent extends grandparent{
    int money=100000;
    int car=1;
    int house=3;
}
class child extends parent{
    int bike=1;
    int mobile=1;
}
public class multilevel_inheritance {
    public static void main(String[] args){

        child c1= new child();
         
        System.out.println("lands: "+c1.land);
        System.out.println("asset: "+c1.asset);
        System.out.println("money: "+c1.money);
        System.out.println("car: "+c1.car);
        System.out.println("house: "+c1.house);
        System.out.println("mobile: "+c1.mobile);
        System.out.println("bike: "+c1.bike);
    }
}
