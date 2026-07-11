public class recursion {
    public static int vpr(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+vpr(n-1);
        }
            
    }
    public static void main(String[] args){
        int a= vpr(10);
        System.out.println(a);
    }
    
}
//  it is the nested method which is use to call thhe method inside the method.