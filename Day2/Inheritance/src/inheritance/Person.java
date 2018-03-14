/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    String firstName = "Unknown";
    String lastName = "Unknown";
    int age;
    
    Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 1;
    }
    
    Person(String fname,String lname,int age) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }
    
    Person(Person object) {
        this.firstName = object.firstName;
        this.lastName = object.lastName;
        this.age = object.age;
    }
    
    void read() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        this.firstName = myInput.nextLine();
        
        System.out.println("Enter Last Name : ");
        this.lastName = myInput.nextLine();
        
        System.out.println("Enter age : ");
        this.age = myInput.nextInt();
    }
    
    void display() {
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("age : " + this.age);
    }
}
