
package com.example.test;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URLConnection;


public class program1 {

    
    public static void main(String[] args) {
       
        
     //Buffered Reader is used for reading characters , arrays for effiecient reading of characters ,strings
     //An InputStreamReader is a bridge from byte streams to character streams:
     //It reads bytes and translates them into characters according to a specified character encoding.  
     
     BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
     String line ="";
     try {
         while(true)
          {
                System.out.println("Enter the URL to download");
           if(!(line=reader.readLine()).equalsIgnoreCase("exit")){
               
               URL url =new URL(line);
               URLConnection conn=url.openConnection();
               String[] tokens=line.split("/");
               byte b[]=new byte[1024];
               //InputStream class is the superclass of all classes representing an input stream of bytes.
               InputStream is=conn.getInputStream();
               
               //Now we have to write Input stream part in file
               FileOutputStream os=new FileOutputStream(tokens[tokens.length-1]);
               int i=0;
               while((i=is.read(b))!=-1)
               {
              os.write(b, 0, i);
               
               }
               
               
               
               
            System.out.println(line);}
          
          else
          {
                System.exit(0);
          }
          
          }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("I am in IOE exception");
        }
     
       
        
   
    
    
    
    }

   
        
        
}
