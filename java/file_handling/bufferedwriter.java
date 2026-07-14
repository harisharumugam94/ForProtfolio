package file_handling;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;

//faster, wraps around the above for efficiency

public class bufferedwriter {
    public static void main(String[] args) {
        try{
             FileWriter w = new FileWriter("output1.txt");
             BufferedWriter bw= new BufferedWriter(w);
             bw.write("i am the one");
             bw.newLine();
             bw.write("i am the backend developer");
             bw.close();
             System.out.println("success");
        }
        catch(Exception e){
            System.out.println("error: "+e);
        }
    }
    
}
