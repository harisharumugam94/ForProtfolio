//The final keyword is used to prevent modification.
//It can be used with:
//Variables
//Methods
//Classes


public class Final {
    final int abb=100;
    public static void main(String[] args){
        Final f = new Final();
        System.out.println(f.abb);
        //f.abb=1200; can't change
        //final Final s = new Final();

        //s.name = "Rahul";      // Allowed and remove the final keyword in the outside the main function before execute this code.

        //System.out.println(s.name);
        //This is called as final reference variable.

    }
}