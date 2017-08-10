/*********************************************
*
* Purpose:To calculate and print the car loan
*
*@author aashish
*@version 1.0
*@since 7/08/2017
**********************************************/

package com.bridgelabz.util;

public class CarLoan{
    public static void main(String args[]){

        //take values from commandline arguments
        double P=Double.parseDouble(args[0]);
        float Y=Float.parseFloat(args[1]);
        float R=Float.parseFloat(args[2]);

        float n=Y*12;
        double r=R/12/100;
        
        //apply formula
        double payment=(P*r)/(1-Math.pow(1+r,-n));
      
        System.out.println(payment+"rs");
   }
}
    