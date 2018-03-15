/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3classactivity;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Day3ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Faculty f1 = new Faculty();
        f1.readData();
        f1.readValues();
        f1.getData();
        f1.displayData();
        f1.displayValues();
        f1.setData();
    }
    
}

class Person {
    String name;
    int age;
    void readData() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name : ");
        name = input.nextLine();
        
        System.out.println("Enter age : ");
        age = input.nextInt();
    }
    void displayData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

interface Employee {
    
    
    void readValues();
    void displayValues();
}

class Faculty extends Person implements Employee {
    String course;
    String type;
    int salary;
    
    void setData() {
        System.out.println("Course : " + course);
    }
    
    void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Course : ");
        course = input.nextLine();
    }
    
    @Override
    public void readValues() {
        Scanner input = new Scanner(System.in);
        System.out.println("Part-time / Full-time ? : ");
        type = input.nextLine();
        System.out.println("Enter Salary : ");
        salary = input.nextInt();
    }

    @Override
    public void displayValues() {
        System.out.println("Type : " + type);
        System.out.println("Salary : " + salary);
    }
    
}
