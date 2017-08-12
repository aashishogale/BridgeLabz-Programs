/***************************************************************************
* Purpose : to calculate the harmonic number
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class HarmonicNumber{
    public static void main(String args[]) {
        

        //use integer  to get input
        int nharmonic=Integer.parseInt(args[0]);
        
        //use float to get result
        float result=0;
        
        // use for loop to calculate the harmonic no
        for(float i=1;i<=nharmonic;i++) {
           
            result=result+(1/i);
            System.out.print("1/"+i+"+");
        }
        System.out.println("="+result);
   }
}