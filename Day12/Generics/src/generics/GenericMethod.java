/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author macstudent
 */
public class GenericMethod {

   public static < E > void printArray( E[] inputArray ){
   for(E element : inputArray ){
       System.out.printf("%s ", element);
   }
       System.out.println();
   }
    
    
    public static void main(String[] args) {
        Integer[] intArray = { 1,2,3,4,5};
        Double[] doubleArray = {1.1 ,2.2 , 3.3, 4.4};
        Character[] charArray = { 'H','E','L','L','O'};
        
        System.out.println("ARRAY OF INTEGERS");
        printArray(intArray);
        System.out.println("ARRAY OF DOUBLE");
        printArray(doubleArray);
        System.out.println("ARRAY OF CHARACTERS");
        printArray(charArray);
        
        
    }
    
}
