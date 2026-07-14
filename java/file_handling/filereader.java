package file_handling;
import java.io.FileReader;
import java.io.*;

//for simple character/text based read

public class filereader {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("output.txt");
            int v= r.read();
            while(v != -1){
                System.out.println((char)v);
                v= r.read();
                
            }
            r.close();
            
        }
        catch (Exception e){
            System.out.println("error: "+e);
        }
    }
    
}
