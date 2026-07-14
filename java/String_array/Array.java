package String_array;
import java.util.Scanner;



//array is the container which contain the element with the same datatype.
public class Array {
    public static void main(String[] args){
        
        Scanner c = new Scanner(System.in);
        int[] a= new int[3];
        int[] f= {10,50,20,40,30};
        for(int i=0;i<3;i++){
            System.out.printf("enter the element of "+ (i + 1)+" position in the array: ");
            a[i]=c.nextInt();
        }
        System.out.println("the array element: ");
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }

    }   

        
}
