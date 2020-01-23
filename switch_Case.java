/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package last_program;

import java.util.Scanner;
/**
 *
 * @author Patrick CYUBAHIRO
 */
public class Last_Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int cost_Of_Living_Summer = 10, cost_Of_Living_Rainy = 5, cost_Of_Living;    
    int month=0;   
    int cost;
    String number;
    System.out.println("Nairobi is the city under the sun.\n");
    
    
    System.out.println("What is the current month? ");
    Scanner reader = new Scanner(System.in);
    month = reader.nextInt();
    
    // TODO code application logic here
      switch (month) {
         case 1:
           number = "January";
           break;
         case 2:
           number = "February";
	   break;
         case 3:
           number = "March";
           break;
         case 4:
           number = "April";
           break;
         case 5:
           number = "May";
           break;
         case 6:
           number = "June";
           break;
         case 7:
           number = "Jully";
           break;
         case 8:
           number = "August";
            break;
         case 9:
           number = "Septembre";
             break;
         case 10:
           number = "October";
             break;
         case 11:
           number = "November";
             break;
         case 12:
           number = "December";
             break;
         default: 
           number = "Invalid Month";
           break;
      }
      System.out.println(number);
      
      System.out.println("What is the current cost of living? ");
    // Scanner reader = new Scanner(System.in);
    cost = reader.nextInt();
    
    if ((month==4)||(month==5)||(month==7)||(month==10))
    {
        cost_Of_Living_Rainy = cost * 5;
        System.out.println("The month of "+(number)+ " is in the rainy season. So the cost of living of "+(number)+" is: "+cost_Of_Living_Rainy);
    } 
    else if((month==1)||(month==2)||(month==3)||(month==6)||(month==11)||(month==12))
    {
    cost_Of_Living_Summer = cost * 10;
    System.out.println("The month of "+(number)+ " is in the rainy season. So the cost of living of "+(number)+" is: "+cost_Of_Living_Summer);
    }
   else
    {
    System.out.println("Invalid Cost of Living... Please ensure you typed the correct details and try again");
    }
    }
}
