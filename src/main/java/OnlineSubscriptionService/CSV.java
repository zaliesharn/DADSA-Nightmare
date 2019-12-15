/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineSubscriptionService;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
/**
 *
 * @author USER
 */
public class CSV {
 public   static void reader(){
String line = "";  
String splitBy = ",";  
try   
{  
//parsing a CSV file into BufferedReader class constructor  
BufferedReader br = new BufferedReader(new FileReader("DADSA CWK 2017-18 TRANSACTION(1).csv"));  
while ((line = br.readLine()) != null)   //returns a Boolean value  
{  
String[] transactions = line.split(splitBy);    // use comma as separator  
System.out.println("Transactions [Transaction ID  =" + transactions[0] + ", Item ID =" + transactions[1] + ", Member ID =" + transactions[2] + ", Date =" + transactions[3] + "]"); 
}  
}   
catch (IOException e)   
{  
e.printStackTrace();  
}  

    }
}
