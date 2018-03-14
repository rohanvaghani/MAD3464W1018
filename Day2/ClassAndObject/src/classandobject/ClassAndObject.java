/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class ClassAndObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank myBank = new Bank();
        
        System.out.println("Bank ID : " + myBank.bankID);
        System.out.println("Bank Name : " + myBank.bankName);
        
        Bank yourBank = new Bank();
        
        myBank.bankID = 11;
        myBank.bankName = "ICICI";
        
        System.out.println("Bank ID : " + myBank.bankID);
        System.out.println("Bank Name : " + myBank.bankName);
        
        myBank.getBankName();
        
        yourBank.setBankName("RBC");
        yourBank.getBankName();
        
        Scanner myInput = new Scanner(System.in);
        String name;
        
        System.out.println("Enter Bank Name : ");
        name = myInput.nextLine();
        
        yourBank.setBankName(name);
        yourBank.getBankName();
                
        Arithmetic operation1 = new Arithmetic();
        
        System.out.println("Addition : " + operation1.addition(10, 20));
        System.out.println("Addition : " + operation1.addition(10.23f, 20.17f));
        System.out.println("Addition : " + operation1.addition(10, 20,50));
        Arithmetic.multiplication(10, 20,50);
        
        Arithmetic.n1 = 20;
        Arithmetic.n2 = 20;
        System.out.println(Arithmetic.n1 + " " + Arithmetic.n2);
    }
    
}
