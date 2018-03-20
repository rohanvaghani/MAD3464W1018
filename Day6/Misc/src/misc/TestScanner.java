/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package misc;

import java.util.Scanner;

/**
 *
 * @author jkp
 */
public class TestScanner {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter value of number : ");
        int n1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Enter value of percentage : ");
        float per = Float.parseFloat(input.nextLine());
        
        System.out.println("Enter name : ");
        String name = input.nextLine();
        
        System.out.println(" number : " + n1 + " per : " + per +
                " name " + name);
        
        //int num = Integer.parseInt(input.nextLine());
        
//        float f1 = Float.parseFloat("12.34f");
//        Double.parseDouble("123.456");
        
        
    }
}
