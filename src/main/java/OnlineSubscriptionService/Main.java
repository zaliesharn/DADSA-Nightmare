/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineSubscriptionService;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   
    
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter your name");  
    option = scanner.next();  
    
    switch (option) {
       case '1': 
       //browse items
       System.out.println("a");
       break;
       case '2':
       //view own items
       System.out.println("b");
       break;
       case '3':
       //add items
       System.out.println("d");
       break;
       case '4':
       //remove items
       System.out.println("e");
       break;
       case '5':
       //view requested list
       System.out.println("f");
       break;
       case '6':
       //view transations
       System.out.println(" Here ya go! ");    
       CSV.reader();
       break;
       default:
       System.out.println(" We don't know what you mean. ");
     }    
    
             
    }
    
}
