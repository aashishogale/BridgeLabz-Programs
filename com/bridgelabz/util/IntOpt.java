/***************************************************************************
* Purpose : Get input and Done Some operations  using Integer Values
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class IntOpt {
	
	public static void main(String args[]) { 

		Scanner sc = new Scanner(System.in);
		
		//a,b,c is decleared To take input from user
		int a, b, c;
		
		//Taking Input From User
		System.out.print("Enter values A:");
		a=sc.nextInt();
		System.out.print("Enter values B:");
		b=sc.nextInt();
		System.out.print("Enter values C:");
		c=sc.nextInt();
		

		//Prints The output  
		System.out.println("a + b * c = "+( a + b * c ));
		System.out.println("a * b + c = "+( a * b + c ));
		System.out.println("c + a / b = "+( c + a / b ));
		System.out.println("a % b + c = "+( a % b + c ));
	}
}
