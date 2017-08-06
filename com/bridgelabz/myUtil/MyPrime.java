/****************
* Compile javac -d bin MyPrime.java
* Execute java -cp com.bridgelabz.myUtil.MyPrime
*
* Purpose:To print Hello world
*
*@author aashish
*@version 1.0
*@since 6/08/2017
****************/
package  com.bridgelabz.myUtil;

public class MyPrime {
  public static void main(String args[]) {
     int value;
     value=Integer.parseInt(args[0]);
     for(int i=2;i<value;i++){
       if (value%i==0){
         flag=1;
         break; /*break common to c and java*/
   
       }
     }
    if (flag==1){
      System.out.println(value+"is Prime");
    }    
    else{
         System.out.println(value+"is not prime");
    }
  }
}