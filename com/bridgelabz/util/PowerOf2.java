/***************************************************************************
* Purpose : To take command line argument n and calculate 2^n
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;


public class PowerOf2 {
    public static void main(String args[]) {
         
        int npower=Integer.parseInt(args[0]);
        
        //use loop to increase powers for 2
        for(int i=0;i<=npower;i++) {
         
            System.out.println("2^"+i+"="+Math.pow(2,i));
        }
    }
}  