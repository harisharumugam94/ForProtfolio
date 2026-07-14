package thread;

class Bbb implements Runnable{
    public void run()//Runnable is preferred because Java only allows single inheritance — if your class already extends something else, you can't also extend Thread, but you can implement Runnable.
    {
        for(int i=0;i<50;i++){
            System.out.println(10);
        }
    }

}
public class runnable {
    public static void main(String[] args){
        Bbb b=new Bbb();
        Thread B = new Thread(b);
        B.start();
    }
    
}
