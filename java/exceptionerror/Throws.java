//Used in the method declaration.

public class Throws{
    void display()throws RuntimeException{
        int a=10;
        int b=0;
        
        System.out.println(a/b);

    }
    public static void main(String[] agrs){
        Throws t = new Throws();
        try{
            t.display();
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
        
    } 
}