//whileloop is used to iterate or loop the specific block of code until the conndition is true.It is used when the number of iteration is unknown.
public class whileloop {
    public static void main(String[] args){
        int a=10;
        boolean flag = true;
        while(flag && a<=100){
            System.out.println(a+=10);
            if(a>=100){
                flag=false;
            }
        }
    }
    
}
