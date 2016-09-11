
package com.example.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
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
       
        String fi="C:/Users/HOME/Desktop/java/down.txt";
        
     //Buffered Reader is used for reading characters , arrays for effiecient reading of characters ,strings
     //An InputStreamReader is a bridge from byte streams to character streams:
     //It reads bytes and translates them into characters according to a specified character encoding.  
       try{ 
         BufferedReader reader =new BufferedReader(new FileReader(fi));
           String store=" ";
          
           while((store=reader.readLine())!=null)
           {
                String tokens[]=store.split("www");
                for(String i:tokens)
                {
                    System.out.println(i);
                }
                System.out.println(tokens.length);
               
                System.out.println(store);
                
                
              
           
           }
          
           reader.close();
           
          
           }catch(IOException ioe)
               {
                   ioe.printStackTrace();
                   System.out.println("I am in IOException");
               
               }
    
    }       
}
