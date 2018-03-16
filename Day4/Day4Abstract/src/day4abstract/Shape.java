/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4abstract;

/**
 *
 * @author macstudent
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MyShape obj1 = new MyShape();
        
        Circle c1 = new Circle();
        c1.draw();
        c1.display("Hi");
    }
    
}

abstract class MyShape {
    int x;
    int y;
    
    abstract void draw();
    
    void display(String msg) {
        System.out.println(msg);
    }
    
}

class Circle extends MyShape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
        super.x = 20;
        super.y = 30;
        System.out.println("x  = " + super.x + " y = "  + super.y);
    }
    
}

abstract class Rectangle extends MyShape {
    int h;
    abstract void draw();
}