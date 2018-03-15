/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3interface;

/**
 *
 * @author macstudent
 */
public class Day3Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Addition op1 = new Addition();
        op1.display();
        
        Counting cn1 = new Counting();
        cn1.display();
        
        A a1 = new A();
        a1.calcMultiplication();
        a1.display();
        
        B b1 = new B();
        b1.calcDivision();
        b1.calcMultiplication();
        b1.display();
        
        C c1 = new C();
        c1.display();
        c1.calcDivision();
        c1.calcMultiplication();
    }
    
}

interface Arithmetic {
    int n1 = 10;
    int n2 = 10;
    void display();
}

class Addition implements Arithmetic {

//    int n1 = 20;
//    int n2 = 30;
    
    @Override
    public void display() {
        System.out.println("Inside Addition Class");
        //System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }
    
}

class Counting extends Addition {
    
}

interface Multiplication extends Arithmetic {
    void calcMultiplication();
}

class A implements Multiplication {

    @Override
    public void calcMultiplication() {
        System.out.println("Multiplication : " + (n1 * n2));
    }

    @Override
    public void display() {
        System.out.println("n1 = " + n1 + " n2 = " + n2);
    }
    
}

interface Division extends Arithmetic {
    void calcDivision();
}

class B extends Addition implements Division, Multiplication {

    @Override
    public void calcDivision() {
        System.out.println("Division : " + (n1 / n2));
    }

    @Override
    public void display() {
        System.out.println("Inside Class B");
        System.out.println("n1 = " + n1 + " n2 = " + n2);
    }

    @Override
    public void calcMultiplication() {
        System.out.println("Multiplication : " + (n1 * n2));
    }
    
}

class C extends B {
    int n1 =20;
}