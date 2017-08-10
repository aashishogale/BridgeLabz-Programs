/****************************************
*
* Purpose:To print the leap year
*
*@author aashish
*@version 1.0
*@since 7/08/2017
****************************************/

package com.bridgelabz.util;

public class LeapYear{
    public static void main(String args[]){
       int year=Integer.parseInt(args[0]);
       boolean isLeapYear;
       isLeapYear=(year%4==0);
    
       //divisible by  4 and not 100
       isLeapYear=isLeapYear&&(year%100!=0);
    
       //divisible by 4 and not 100 unless dvisible for 400
       isLeapYear=isLeapYear||(year%400==0);

       System.out.println(isLeapYear);

  }
}    