/***************************************************************************
* Purpose : To check which number is rolled maximum no of times
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class RollDie {
   public static void main(String args[]) {
  
    int i,n=Integer.parseInt(args[0]);
      int a[]= new int[6];
       a[0]=a[1]=a[2]=a[3]=a[4]=a[5]=0;
      int rollDie=0,maxDies=0;

      //loop for no of times the dice is rolled
      for(i=0;i<n;i++) {
        rollDie=1+(int)(Math.random()*6);
        System.out.println(rollDie);
       
        //loop for countiing no of face rolls
        switch(rollDie) {
         case 1:
         a[0]++;
         break;
         case 2:
         a[1]++;
         break;
         case 3:
         a[2]++;
         break;
         case 4:
         a[3]++;
         break; 
         case 5:
         a[4]++;
         break;
         case 6:
         a[5]++;
         break;
       }
      }
   int max=(int)Math.max(a[0],Math.max(a[1],Math.max(a[2],Math.max(a[3],Math.max(a[4],a[5])))));
   
    //loop for calculating maximum die roll
    for(i=0;i<6;i++) {
       if(max == a[i]) {
         maxDies=i+1;
         break;
    }

   }
  System.out.println(maxDies+" falls maximum times");
} 
}