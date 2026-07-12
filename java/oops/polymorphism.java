//polymorphism is the ability to perform a single method in different ways.
//there are two type
    //compiler time polymorphism(method overloading)
    //run time polymorphism(method overriding)



//method overloading

public class polymorphism{
    public static void main(String[] args){

        polymorphism p1= new polymorphism();
        System.out.println(p1.add(2,3,4));//method overloading is the ability to define the same method name with different parameter in the same class.   
        System.out.println(p1.add(2,3));
    } 
   
   
   
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b){
        
        return a+b;
    
    }                           
   
}