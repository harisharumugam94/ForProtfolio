
//switch case is use to execute the case if the given input is matched with the case value. 
public class switchcase {
    public static void main(String[] args){
        char a='O';
        switch(a){
            case 'A':
                System.out.println("The letter is A");
                break;
            case 'O':
                System.out.println("The letter is O");
                break;
            case 'R':
                System.out.println("The letter is R");
            default:
                System.out.println("The letter is neither A , R nor O");
        }
    }
    
}
