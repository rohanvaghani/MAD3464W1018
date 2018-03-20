package misc;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

//Dynamic Method Dispatch

class A{
    //override callme()
    void callme(){
        System.out.println("Inside class A");
    }
}
class B extends A{
    //override callme()
  void callme(){
        System.out.println("Inside class B");
    }
}   
class C extends A{
  void callme(){
        System.out.println("Inside class C");
    }
}
public class Dynamic {
public static void main(String ap[]){
    A a=new A(); 
    B b=new B();
    C c=new C();
    
    //c.callme();
    
    A r; //obtain a refrence of type A
    
    r=a;
    r.callme(); //call Class A's
    r=b;
    r.callme();//call class B's
    r=c;
    r.callme();//call class C's
    
}
}
