package file_handling;
import java.io.FileWriter;
import java.io.*;

//for simple character/text based write

public class filewriter {
    public static void main(String[] args) {
         try{
         FileWriter w = new FileWriter("output.txt");
         w.write("i am harish arumugam");
         w.close();
         System.out.println("success");

    }
    catch(Exception e){
        System.out.println("error: "+e);
    }
        
    }
    
   
   
    
}
