//Exception Handling is a mechanism in Java that handles runtime errors so that the program does not terminate unexpectedly.
//try-Contains risky code
//catch-Handles the exception

package exceptionerror;

public class Try_catch {
    public static void main(String[] agrs){ 
    try{ 
        int a =10; 
        int b= 0; 
        int c = a/b; 
        System.out.println(c); 
    } 
    catch (Exception e){
         System.out.println("the zero division error:"+e); 
        } 
    } 
}
    

