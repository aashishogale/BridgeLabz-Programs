/****************************************
*
* Purpose:To calculate windchill factor
*
*@author aashish
*@version 1.0
*@since 7/08/2017
****************************************/

package com.bridgelabz.util;



public class WindChill{
    public static void main(String args[]){
        double temperature=Double.parseDouble(args[0]);
        double velocity=Double.parseDouble(args[1]);
        double windChill;
        
        //apply windchill formula
        windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(velocity,0.16);

        System.out.println(windChill); 
   }
}
           