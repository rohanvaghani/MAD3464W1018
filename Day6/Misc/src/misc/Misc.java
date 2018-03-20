/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package misc;

/**
 *
 * @author jkp
 */
public class Misc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char a[] = { 'a', 'b', '5', '?', ' '};
        
        for (int i=0;i<a.length;i++)
        {
            if (Character.isDigit(a[i]))
                System.out.println(a[i] + " is a digit. ");
            if (Character.isLetter(a[i]))
                System.out.println(a[i] + " is a letter. ");
            if (Character.isWhitespace(a[i]))
                System.out.println(a[i] + " is a whitespace. "); 
        }
        
        int num=19648;
        
        System.out.println(num + " in binary  : " + Integer.toBinaryString(num) );        
        System.out.println(num + " in octal  : " + Integer.toOctalString(num) );
        System.out.println(num + " in hexadecimal : " + Integer.toHexString(num) );
        
        //Wrapper class
        Integer iob =new Integer(100);
        
        int i = iob.intValue();
        System.out.println("Value of i is : " + i + "Value of iob is : " + iob);
        
        //Auto boxing and unboxing
        Integer iobj = 100; // autobox an int
        
        int i1 = iobj; // auto un- box
        System.out.println("Value of i1 is : " + i1 +" "  +"Value of iob is : " + iobj);
        
        
    }
    
}
