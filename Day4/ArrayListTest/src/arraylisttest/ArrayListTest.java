/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class ArrayListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Books book1 = new Books(1, "The Sky", 8);
        Books book2 = new Books(2, "Necklace", 3);
        Books book3 = new Books(3, "Milk", 2);
        Books book4 = new Books(4, "Journey", 3);
        Books book5 = new Books(5, "Wonderer", 4);
        
        ArrayList<Books> library = new ArrayList<Books>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        
        System.out.println("No. of Books : " + library.size());
        
        library.add(2,new Books(10, "Pecific", 9));
        
        library.forEach(bk -> {
            bk.displayInfo();
        });
        
        Collections.sort(library, new BookTitleComparator());
        System.out.println("------ Book Title Comparator--------");
        for(Books bk : library){
            bk.displayInfo();
        }
        
        Collections.sort(library, new BookRatingComparator());
        System.out.println("------ Book Rating Comparator--------");
        for(Books bk : library){
            bk.displayInfo();
        }
        
    }
    
}
