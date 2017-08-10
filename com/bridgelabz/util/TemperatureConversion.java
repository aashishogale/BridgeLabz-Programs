/*********************************************
*
* Purpose:To convert into celsius and fahrenheit
*
*@author aashish
*@version 1.0
*@since 7/08/2017
**********************************************/

package com.bridgelabz.util;

public class TemperatureConversion {
    public static void main(String args[]){

        double celsius=Double.parseDouble(args[0]);
        double fahrenheit=Double.parseDouble(args[1]);
        
        double fahr=(celsius*9/5)+32;
        double cels=(fahrenheit-32)*5/9;

       System.out.println(fahr+" F  "+cels+"  C");
   }
}