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
public class EnumTest {
    enum UserStatus {
            PENDING,
            ACTIVE,
            INACTIVE,
            DELETED;
    };
    
    public static void main(String args[]){
        System.out.println(UserStatus.ACTIVE);
        
        for (UserStatus status : UserStatus.values()) {
            System.out.println(status);
        }
        
        
    }
}
