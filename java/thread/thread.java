package thread;

//A thread is a single path of execution in a program — one sequence of instructions that runs step by step, in order.

class A extends Thread{
    public void run()//Contains the actual code the thread will execute.
    {
       int j=0;
        for(int i=0;i<20;i++){
            j=i;
            
        System.out.println(10);
         try{
            Thread.sleep(10);

        }
        catch(Exception e){
            System.out.println("error: "+e);
        }

       } 
       
    }
}

class B extends Thread{
    public void run(){
        int j=0;
        for(int i=0;i<20;i++){
            j=i;
            
        System.out.println(20);
        try{
            Thread.sleep(10);//Pauses the currently executing thread for the given time (in milliseconds). It's a static method, so you call it as Thread.sleep(...), not on a thread object.

        }
        catch(Exception e){
            System.out.println("error: "+e);
        }
        

       } 
    }
}
public class thread {

    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        
        b.setPriority(10);// set which has high and low priority by range of 1-10.
        a.setPriority(2);
        a.start();//Creates a new thread and calls run() on it 
        b.start();
        try{
            a.join();
            b.join();
        }
        catch(Exception e){
            System.out.println("error: "+e);//Makes the current thread wait until the specified thread finishes running. Useful when you need one thread's result before continuing.
        }
    }
    
}
