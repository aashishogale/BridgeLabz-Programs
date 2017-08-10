/****************************************
*
* Purpose:To print the distance between two points
*
*@author aashish
*@version 1.0
*@since 7/08/2017
****************************************/

package com.bridgelabz.util;



public class Distance {
    public static void main(String args[]) {

         int x=Integer.parseInt(args[0]);
         int y=Integer.parseInt(args[1]);

         //using formula and math functions
         double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
         System.out.println("distance from "+x+ "and" +y+"is"+dist);
}
} 