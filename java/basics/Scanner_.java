//Scanner is use for get the input from the user
import java.util.Scanner;





public class Scanner_ {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();//if string scan is next to the int scan than the  string scan will skiped
        String address = scan.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }   
}
