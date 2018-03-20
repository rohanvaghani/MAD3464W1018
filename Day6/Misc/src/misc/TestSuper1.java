package misc;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
class test_A
{
    int i;
}

// create a subclass by extending class A
 class test_B extends test_A
 {
    int i; // this i hides the i in A
    
    test_B(int a,int b)
    {
        super.i=a; // i in A
        i=b; // i in b
    }
    
    void show()
    {
        System.out.println("i in superclass : " + super.i);
        System.out.println("i in subclass : " +i);
    }
           
 }
       
public class TestSuper1 {

    public static void main(String args[])
    {
        test_B b=new test_B(1,3);
        System.out.println(b.i);
        b.show();
    }
            
}
