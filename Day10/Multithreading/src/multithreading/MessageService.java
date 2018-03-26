/*
 * Author: Rohan Vaghani
 * Purpose: Academic
 * 
 */
package multithreading;

/**
 *
 * @author rv
 */
public class MessageService {
    public static void main(String args[]){
        Carrier carrier = new Carrier();
        (new Thread(new Sender(carrier))).start();
        (new Thread(new Receiver(carrier))).start();
    }
}
