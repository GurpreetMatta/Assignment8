/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Gurpreet Singh
 */
public class Program1 {
   public static void main(String []args) throws FileNotFoundException, IOException
   {
       FileInputStream fis =new FileInputStream("G:\\Netbeams Project Folder\\AcadView Assignment\\src\\assignment8\\abc.txt");
       FileOutputStream fos =new FileOutputStream("G:\\Netbeams Project Folder\\AcadView Assignment\\src\\assignment8\\xyz.txt");
      char ch;
       try{
            int i=0;
            
            do{
                i=fis.read();
               if(i!=-1)
               {
                    ch=(char)i;
                    fos.write(ch);
                       
               }
            }while(i!=-1);
        

        }catch(Exception e)
        {
            e.getMessage();
        }
        fis.close();
        fos.close();
   
        
   }
}
