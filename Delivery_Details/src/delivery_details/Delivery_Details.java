/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery_details;

/**
 *
 * @author tinas
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Delivery_Details 
{

    
    public static void main(String[] args) 
    {
        int price1 = 300;
        int price2 = 500;
        int price3 = 700;
        double vat = 0.14;
        int vatAmount = 0;
        int totaldue = 0;
        int month = 8 , day = 26, year = 2016;
        String divider = "*****************************************************";
        
        
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println("DELIVERY REPORT - Created on " + df.format(dateobj));
        System.out.println(divider);
             
        String[] towns = {"1)Cape Town", "2)Pretoria", "3)Durban"};
        String input1 = (String) JOptionPane.showInputDialog(null, "Select the town the parcel will be delivered to", "Input" ,JOptionPane.QUESTION_MESSAGE, null, towns , towns[1]); 
        System.out.println("TOWN: " + input1);
        
        
        String[] weight = {"1) 0kg - 4kg", "2) 5kg - 9kg", "3) Over 10kg"};
        String input2 = (String) JOptionPane.showInputDialog(null,"Select the weight category of the parcel to be delivered:", "Input" ,JOptionPane.QUESTION_MESSAGE,null ,weight ,weight[1]);
        System.out.println("WEIGHT: " + input2);
        
        String[] company = {"1) ABC Couriers", "2) Fast Track", "3) Rest Assured"};
        String input3 = (String) JOptionPane.showInputDialog(null, "Select the courier company to deliver the parcel weight: ", "Input", JOptionPane.QUESTION_MESSAGE, null, company,company[0]);
        System.out.println("COURIER: " + input3);
        
        
        
        if(input2 == "1) 0kg - 4kg")
        {
            vatAmount = (int) (price1 * vat);
            totaldue = (vatAmount + price1);
            System.out.println(" PRICE: " + " R " + price1 + "\nVAT (14%): " + " R " + vatAmount + "\nTOTAL DUE: " + " R " + totaldue);
        }
            else
                if(input2 == "2) 5kg - 9kg")
                {
                    vatAmount = (int) (price2 * vat);
                    totaldue = (vatAmount + price2);
                    System.out.println(" PRICE: " + " R " + price2 + "\nVAT (14%):" + " R " + vatAmount + "\nTOTAL DUE: " + " R " + totaldue);
                }
                else
                    if(input2 == "3) Over 10kg")
                    {
                        vatAmount = (int) (price3 * vat);
                        totaldue = (vatAmount + price3);
                        System.out.println(" PRICE: " + " R " + price3 + "\nVAT (14%): " + vatAmount + "\nTOTAL DUE: " + " R " + totaldue);
                    }
        
            System.out.println(divider);
        
 
     
    }

    
    
}
    
