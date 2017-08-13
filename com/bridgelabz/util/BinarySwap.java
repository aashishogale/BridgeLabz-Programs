/***************************************************************************
**********
 Purpose : Find the binary number for given number as command line argument and swap it
*

*
@author : Aashish
*@version : 1.8.0

*@since : 11-08-2017

**************************************************************************************/





package com.bridgelabz.util;



public class BinarySwap {

   
   public static void  main(String args[]) {

       
      
      //takes the command line argument from user

      int nNumber = Integer.parseInt(args[0]);


      int mDivision = 1;

      int counter= 0;
      int convertCounter=7;
      int checkDigit,finalNumber=0;
      String newNumber="";
      String upperNibble,lowerNibble;


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
            newNumber+="0";
            counter++
; 
         }

          else {
            
            System.out.print("1");

            newNumber+="1";
            nNumber -= mDivision;

            counter++;
         }
	
         mDivision /= 2;

      }

     
     upperNibble=newNumber.substring(4,8);
     lowerNibble=newNumber.substring(0,4);
      
     newNumber=upperNibble+lowerNibble;
     System.out.println();
     System.out.println(newNumber);
      
     
    
     for(int i=0;i<newNumber.length();i++) {
     
     checkDigit=Integer.parseInt(Character.toString(newNumber.charAt(i)));
       if(checkDigit==1) {
      
         finalNumber+=(int)Math.pow(2,convertCounter);
         convertCounter--;
     }

      else {

        convertCounter--;


}
}

    
     

     

      System.out.println(finalNumber);

   }

}
