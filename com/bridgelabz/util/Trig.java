/****************************************
*
* Purpose:To show various trignometric functions
*
*@author aashish
*@version 1.0
*@since 7/08/2017
****************************************/

package com.bridgelabz.util;



public class Trig{
    public static void main(String[] args){

        //To convert into double format
        double degrees=Double.parseDouble(args[0]);
        double radians=Math.toRadians(degrees);
        
        //apply math formulas        
        double s=Math.sin(radians);
        System.out.println("sin("+degrees+")="+s);
        
        double c =Math.cos(radians);
        System.out.println("cos("+degrees+")="+c);



        double t=Math.tan(radians);
        System.out.println("tan("+degrees+ ")="+t);
        System.out.println(s+"/"+c+"="+s/c);
        
        double r=s*s+c*c;
        System.out.println(s*s+"+"+c*c+"="+r);
    }
}        