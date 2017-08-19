
/***************************************************************************
* Purpose : To Display the month of the given month and year in a calendar format
*
*@author : Aashish
*@version : 1.8.0
*@since : 18-08-2017
****************************************************************************/



package com.bridgelabz.lib;


public class DisplayCalendar {

    static int dayOfWeek(int mYear,int mMonth){

        int mDay = 1;

        //Calculate the date fall on
        int y = mYear - (14 - mMonth) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = mMonth + 12 * x * ((14 - mMonth) / 12) - 2;
        int d = (mDay + x + 31 * m / 12) % 7;

        //returns falllon date
        return d;
    }

    static boolean isLeapOrNot(int mYear){
        boolean mIsLeap = false;
        if( mYear >= 1582 ) {
            mIsLeap = (mYear % 4) == 0;
            mIsLeap = mIsLeap && (mYear % 100) != 0;
            mIsLeap = mIsLeap || (mYear % 400) == 0;
        }
        if( mIsLeap == true )
            return mIsLeap;
        else
            return mIsLeap;

    }

    static void displayCal(int mYear,int mMonth){
        int date = dayOfWeek(mYear,mMonth);
        int mNumber = 1;
        int counter = 0;
        String[] months = {"","January","February","March",
                            "April","May","Jun","July",
                            "August","September","Octomber",
                            "November","December"};

        int[] mMonthsNOLeap = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        boolean isLeap = isLeapOrNot(mYear);
        if(isLeap == true) {
            mMonthsNOLeap[2] = 29;
        }

        int i = mMonth;
        System.out.println("   "+months[i] + "   " + mYear);
        System.out.println("=====================");
        System.out.println("S  M  T  W  T  F  S");
        System.out.println("====================");
        for(int k = 0; k < 6; k++ ){
            for(int j = 0; j < 7; j++ ){
                if(counter < date){
                    System.out.print("   ");
                    counter++;
                }
                else if(mNumber <= mMonthsNOLeap[mMonth]) {
                    System.out.print(mNumber);
                    mNumber++;
                    if(mNumber < 11)
                        System.out.print("  ");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        displayCal(year,month);

    }
}