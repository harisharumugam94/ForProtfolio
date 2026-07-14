package file_handling;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;



//faster, wraps around the above for efficiency


public class bufferedreader {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("output1.txt");
            BufferedReader br = new BufferedReader(r);
            String v= br.readLine();
            while(v != null){
                System.out.println(v);
                v= br.readLine();
            }
            br.close();
            
        }
        catch (Exception e){
            System.out.println("error: "+e);
        }
    }
    
}

