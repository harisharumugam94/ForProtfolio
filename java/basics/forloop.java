//for loop - it is used to iterate or loop the specific block of code for the specific number of times.It is used when the number is known.
public class forloop {
    public static void main(String[] args){
        
    int a = 10;
    for(int i=1 ; i<=10 ; i++){
        int b = i*10;
        System.out.println(a += b);
        if (a>=100){
            break;
        }
    }
    }
}
