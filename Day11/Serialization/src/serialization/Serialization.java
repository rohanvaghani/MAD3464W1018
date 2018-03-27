/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author macstudent
 */
public class Serialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Employee e = new Employee();
        e.name = "Rohan";
        e.address = "Toronto";
        e.SSN = 111222333;
        e.number = 101;
        
        try {
            FileOutputStream fileout = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            
            out.writeObject(e);
            
            out.close();
            fileout.close();
            
            System.out.println("Serialized data is saved as employee.txt");
            
        }catch(IOException i ) {
            i.printStackTrace();
        }
    }
    
}
