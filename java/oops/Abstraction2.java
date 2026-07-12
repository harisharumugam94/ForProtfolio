//interface  is a blueprint that tells a class what methods it must have, but not how they work.
//interface has abstract mmethod not normal.

interface dog {

    void bark();
}

interface cat{
    void mew();

}
class animal implements dog , cat{

    public void bark(){
        System.out.println("dog is barking");
    }
    public void mew(){
        System.out.println("cat is sound like mew");
    }

}




public class Abstraction2 {
    public static void main(String[] args){
        animal a1 = new animal();
        a1.bark();
        a1.mew();
    }
    
}
