/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject;

/**
 *
 * @author macstudent
 */
public class Arithmetic {
    
    static int n1;
    static int n2 = 10;
    
    int addition(int... num) {
        int i=0, sum=0;
        
        for(i=0;i<num.length;i++) {
            sum += num[i];
        }
        return sum;
    }
    
    int addition(int num1, int num2) {
        return num1 + num2;
    }
    
    int addition(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    float addition(float num1, float num2) {
        multiplication(10,30);
        return num1 + num2;
    }
    
    static int multiplication(int... num) {
        int i=0, answer=1;
        
        for(i=0;i<num.length;i++) {
            answer *= num[i];
        }
        System.out.println("Multiplication : " + answer);
        return answer;
    }
}
