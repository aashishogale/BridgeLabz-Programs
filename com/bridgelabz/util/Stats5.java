/***************************************************************************
* Purpose : Print Avg, Min and Max of random number that generated from 0 to 1
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class Stats5 {

   public static void main( String args[]) {

      //Generate Random Number from 0 to 1
      double mFirst = Math.random();
      double mSecond = Math.random();
      double mThree = Math.random();
      double mFour = Math.random();
      double mFive = Math.random();

      //Calculates Avg of 5 Random numbers 
      double mAvg = (mFirst+mSecond+mThree+mFour+mFive)/5;
      System.out.println("Avg value is "+mAvg);

      //Calculates Min value from 5 random numbers 
      double mMin = Math.min(mFirst,Math.min(mSecond,Math.min(mThree,Math.min(mFour,mFive))));
      System.out.println("Min value is "+mMin);

      //Calculates Max value from 5 random numbers 
      double mMax = Math.max(mFirst,Math.max(mSecond,Math.max(mThree,Math.max(mFour,mFive))));
      System.out.println("Max value is "+mMax);
   }
}