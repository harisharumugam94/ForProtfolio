//Used to throw an exception manually.



public class Throw{
    public static void main(String[] agrs){
        try{
            int a = 10;
            int b = 0;
            if(a/b==0){
                throw new ArithmeticException("zero division error");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
