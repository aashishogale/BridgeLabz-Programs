/****************************
*
* Purpose:To find quadratic roots
*
*@author aashish
*@version 1.0
*@since 7/08/2017
*****************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class Quadratic{
    public static void main(String args[]){
   
       int a,b,c;
       double root1,root2,d;

       //use scanner object to get user input
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a");
       a=sc.nextInt();
       System.out.println("enter b");
       b=sc.nextInt();
       System.out.println("enter c");
       c=sc.nextInt();

       //use formula 
       d=(b*b)-(4*a*c);

       //use the if else condition
       if(d>0) {

          System.out.println("roots are real and unequal");
          root1=(-b+Math.sqrt(d))/(2*a);
          root2=(-b-Math.sqrt(d))/(2*a);
          System.out.println("first root is:"+root1);
          System.out.println("second root is:"+root2);
       }

       else if(d==0) {

          System.out.println("roots are equal and real");
          root1=(-b+Math.sqrt(d))/(2*a);
          System.out.println("roots are "+root1);
      }
      else {

          System.out.println("roots are imaginary");
      }
   }
}
