public class condition_statement  {
    public static void main(String[] args){
        int marks=97;
        if(marks>=90){
            System.out.println("super man you got the A grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("ok good you got B grade");
        }
         else if(marks>=70 && marks<80){
            System.out.println("fine you got C grade");
        }
         else if(marks>=60 && marks<70){
            System.out.println("improve yourself. you got D grade");
        }
        else{
            System.out.println("you fail because you are the worst");
        }


    }
    
}
