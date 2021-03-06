/***************************************************************************
**********
 Purpose : Find the Sin value of taylor series
*
@author : Aashish
*@version : 1.8.0

*@since : 11-08-2017

**************************************************************************************/


package com.bridgelabz.util;



public class Sin {

  //function for calculating factorial

   public static double factorial(double no) {

      double fact=1;
      for(double i=no;i>0;i--) {
      fact=fact*i;
      }//end of loop

   return fact;
  }

   public static void main(String args[]) {


      //declare double variable for angle and initialize with command line
      double angle=Double.parseDouble(args[0]);
      angle=angle%(2*Math.PI);
      
      //declare double variable for factorial and sinx and denominator
      double fact=0;
      double sinx=0;

      //declare integer variable for count
      int count=0;
      int flag=0;
      double deno=1;
 

      //initialize loop
      while(count<5) {
      
        
        //condition for adding
        if(flag==0) {
       
           fact=factorial(deno);
           sinx=sinx+(Math.pow(angle,deno)/fact);
           deno+=2;
           flag=1;
        }

       else {

          sinx=sinx-(Math.pow(angle,deno)/factorial(deno));
          deno+=2;
          flag=0;
       }

     count++;

     }//end of loop
 
     System.out.println(sinx);
   }
}

      
   
         
      
   
 