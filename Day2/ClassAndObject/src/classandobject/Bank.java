/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject;

/**
 *
 * @author macstudent
 */
public class Bank {
    int bankID = 10102;
    String bankName = "Scotia Bank";
            
    void getBankName() {
        System.out.println("Bank Name : " + this.bankName);
    }
    
    void setBankName(String name) {
        this.bankName = name;
    }
}
