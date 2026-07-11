
//do-actual statement which execute if the condition in the while statement is true




public class Dowhileloop {
    public static void main(String[] args){
        int a=20;
        boolean flag = true;
        do{
            System.out.println(a+=10);
            if(a>=100){
                flag=false;
            }
        }while(flag && a<=100);
    }
    
}
