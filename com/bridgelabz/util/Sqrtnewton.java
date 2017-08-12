/***************************************************************************
* Purpose : to calculate square root using newton method
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/


package com.bridgelabz.util;


public class Sqrtnewton {
    public static void main(String args[]) {
        
        double c=Double.parseDouble(args[0]);
   
        double epsilon =1e-15;
 
        double t=c;

        while(Math.abs(t-c/t)>epsilon*t){

        t=(c/t+t)/2.0;
       
        }
     
        System.out.println(t);
   }
}