/***************************************************************************
* Purpose : display the Sum of two dice.  
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class SumOfTwoDice {

   public static void main(String args[]) {

      //Takes Random no generates from  1 to 6
      int mFirst = 1 + (int)(Math.random() * 6);
      int mSecond = 1 + (int)(Math.random() * 6);

      //And Calculate the sum
      int Sum = mFirst + mSecond;

      System.out.println("Sum of Two Dice is "+ Sum);
   }
}