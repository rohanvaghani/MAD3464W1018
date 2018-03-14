/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author macstudent
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person one = new Person();
        one.display();
        
        Person rohan = new Person("Rohan","Vaghani",21);
        rohan.display();
        
        Person rohan2 = new Person(rohan);
        rohan.display();
        
//        Employee e1 = new Employee(458.19);
//        e1.display();
        
        Employee e2 = new Employee();
        e2.display();
        
        e2.firstName = "ABC";
        e2.lastName = "XYZ";
        e2.age = 19;
        e2.salary = 182.56;
        e2.display();
        
        Employee e3 = new Employee();
        e3.read();
        e3.display();
    }
    
}
