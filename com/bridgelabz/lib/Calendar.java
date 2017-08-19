
/***************************************************************************
* Purpose : to display the day of the calendar
*
*@author : Aashish
*@version : 1.8.0
*@since : 18-08-2017
****************************************************************************/



package com.bridgelabz.lib;

public class Calendar {
    
    //Function for calculating the day of the week
    public static int dayOfWeek(int month, int day, int year) {
        int m0, d0, y0, x;

        y0 = year - (14 - month) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = month + 12 * ((14 - month) / 12) - 2;
        d0 = (day + x + 31 * m0 / 12) % 7;
        return d0;
    }

    //Function for displaying the day
    public static String displayDay(int index) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
        return days[index];

    }

    public static void main(String args[]) {

        int number = Calendar.dayOfWeek(Integer.parseInt(args[0]), 
                     Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println(displayDay(number));
    }
}