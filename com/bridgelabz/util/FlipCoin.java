/***************************************************************************
* Purpose : to calculate percentage of heads and tails in flipped coins
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/


package com.bridgelabz.util;

public class FlipCoin {
    public static void main(String args[]){
       
       //declare and initialize integer values with command line 
       int n=Integer.parseInt(args[0]);
       int heads=0,tails=0;
   
       //initialize for loop for the number of times heads and tails       
       for (int i=0;i<n;i++) {
      
           //check condition for heads or tails 
           if(Math.random()<0.5) {
              System.out.println("Heads");
              heads++;
            
           }
    
           else {
              System.out.println("Tails");
              tails++;
           }
       }//end of loop
       
      float headPercentage=(float)100*heads/n;

      float tailPercentage=(float)100*tails/n;
      
      System.out.println("percentage of heads is"+ headPercentage+"%");
      System.out.println("percentage of tailss is"+tailPercentage +"%");
   }
}