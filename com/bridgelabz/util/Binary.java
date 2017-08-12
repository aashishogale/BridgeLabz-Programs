/***************************************************************************
*
 Purpose : Find the binary number for given number as command line argument
*

*
@author : Aashish
*@version : 1.8.0

*@since : 11-08-2017

****************************************************************************/



//package com.bridgelabz.util;



public class Binary {

   
   public static void  main(String args[]) {

       
      
      //takes the command line argument from user

      int nNumber = Integer.parseInt(args[0]);


      int mDivision = 1;

      int counter= 0;


      //find the power of 2 from small to large


      while(mDivision <= nNumber/2)
 {
         mDivision *=2;


       }
 
     //prints the binary number from large to small

      while(mDivision > 0) {

          
         if(counter==4) {
            System.out.print(" ");
            counter=0;
          
          } 



         if(nNumber < mDivision) {

            System.out.print("0");
            counter++
; 
         }

          else {
            
            System.out.print("1");

            nNumber -= mDivision;

            counter++;
         }
	
         mDivision /= 2;

      }

      System.out.println();

   }

}
