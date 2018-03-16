/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4classactivity;

import java.util.ArrayList;

/**
 *
 * @author macstudent
 */
public class Day4ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s1 = new Student(1, "Rohan", 100);
        Student s2 = new Student(2, "Rushang", 95.12);
        Student s3 = new Student(3, "Jaydeep", 95.12);
        
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        System.out.println("No. of Student : " + list.size());
        
        list.add(1,new Student(4, "Abhishek", 5.10));
        
        list.forEach(st -> {
            st.displayInfo();
        });
    }
    
}
