public class Finally {
    public static void main(String[] args) 
    { try
        { 
            int a=10; 
            int b = 0; 
            int c = a/b; 
            System.out.println(c); 
        } 
        catch(Exception e){
             System.out.println("the zero division exception"+e); 
            } 
            finally
            { 
                System.out.println("the program is over");
             } 
            } 
        }
    

