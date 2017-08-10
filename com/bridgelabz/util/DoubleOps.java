/****************************
*
* Purpose:To print oprations on double values
*
*@author aashish
*@version 1.0
*@since 7/08/2017
*****************************/

package com.bridgelabz.util;

public class DoubleOps {

  public static void main(String args[]){
      
      //take double data fro commandline
      double a=Double.parseDouble(args[0]);
      double b=Double.parseDouble(args[1]);
      double sum=a+b;
      double prod=a*b;
      double quot=a/b;
      double rem=a%b;

      System.out.println(a+"+"+b+"="+sum);
      System.out.println(a+"*"+b+"="+prod);
      System.out.println(a+"/"+b+"="+quot);
      System.out.println(a+"%"+b+"="+rem);

      System.out.println();

      //apply math functions
      System.out.println("sin(pi/2)="+Math.sin(Math.PI/2));
      System.out.println("log(e) ="+Math.log(Math.E));
   }
}   