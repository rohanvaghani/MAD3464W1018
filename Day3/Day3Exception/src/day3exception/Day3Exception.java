/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3exception;

/**
 *
 * @author macstudent
 */
public class Day3Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 10;
        int n2  = 0;
        int ar1[] = {10,20,30};
        
        try {
            if(n2 == 0) {
                throw new ArithmeticException();
            }
            else {
                n1 = n1 / n2;
            }
        }
        
        catch(ArithmeticException e) {
            System.out.println("Unable to divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array element unavailable");
        }
        catch(Exception e) {
            System.out.println("Something Wrong");
        }
        finally {
            System.out.println("Value of n : " + n1);
        }
    }
    
}
