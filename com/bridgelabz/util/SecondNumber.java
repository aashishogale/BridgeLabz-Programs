/***************************************************************************
* Purpose : to display the second largest and smallest number 
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class SecondNumber {

   public static int secondLargest(int numbers[]) {

 
      //integer variable for highest and second highest number
      int highest = 0;
      int secondHighest = 0;
 
      //loop for all the numbers in the array
      for(int n:numbers) {
 
         if(highest < n) {
 
           secondHighest = highest;
           highest =n;
 
          } 
         else if(secondHighest < n) {

           secondHighest = n;
 
          }
 
      }//end of loop

        return secondHighest;

 
   }

     // method for finding second smallest number
     public static int secondLowest(int numbers[]) {

 
        //integer variable for lowest and second lowest number
        int smallest = numbers[1];
        int secondSmallest = 0;
 
        //loop for all the numbers in the array
        for(int n:numbers) {
 
           if(smallest > n) {
 
             secondSmallest = smallest;
             smallest =n;
 
            } 

           else if(secondSmallest > n) {

              secondSmallest = n;
 
          }
 
      }//end of loop

        return secondSmallest;

 
   }



    public static void main(String args[]) {

        //integer variables to store second smallest and second larget number
       int secSmallestNumber,secLargestNumber;
       int[] numbers =new int[5];

       //loop to add number from command line to array
       for(int i=0;i<5;i++) {
        
          numbers[i]=Integer.parseInt(args[i]);
       
       }//end of loop
  
       //passing array to function
       secSmallestNumber=secondLowest(numbers);
       secLargestNumber=secondLargest(numbers);
   
       System.out.println("second smallest number is "+secSmallestNumber);
       System.out.println("second largest number is  "+secLargestNumber); 
  
   }
}
        












     