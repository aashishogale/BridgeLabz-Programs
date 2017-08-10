/****************************************
*
* Purpose:To print the day of the week
*
*@author aashish
*@version 1.0
*@since 7/08/2017
****************************************/

package com.bridgelabz.util;

public class DayOfWeek {
    public static void main(String args[]) {
         
         int month=Integer.parseInt(args[0]);

         int day=Integer.parseInt(args[1]);
         int year=Integer.parseInt(args[2]);

         int m0,d0,y0,x;
         
         y0=year-(14-month)/12;
         x=y0+y0/4-y0/100+y0/400;
         m0=month+12*((14-month)/12)-2;
         d0=(day+x+31*m0/12)%7;

         System.out.println(d0);
  }
}
         