/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bird
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String myString;
        ArrayList myInput=new ArrayList();
        Scanner scan=new Scanner(System.in);
        myString=scan.nextLine();
        
        String[] parts=myString.split(" ");
        int lengthSeq = parts.length;
       System.out.println(parts.length);
       
            // TODO code application logic here
        
            
        /*
         Contact[] contactList=new Contact[3];
       
        contactList[0]= new Contact("Tuan","La","727 458 7707");
        contactList[1]= new Contact("Super","Apple","727 458 7707");
        contactList[2]= new Contact("Home","Depot","727 458 7707");
        Sort sort = new Sort();
        sort.selectionSort(contactList);
        //sort.insersionSort(contactList);
        Palindrome test=new Palindrome("aa");
        System.out.println(test);
        Factorial fact=new Factorial(5);
        System.out.println(fact);

        for (Contact my:contactList)
            System.out.println(my);
        */
    }
    
}
