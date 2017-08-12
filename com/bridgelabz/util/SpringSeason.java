/***************************************************************************
* Purpose : Spring Season
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

class SpringSeason {
	
	public static void main(String args[]) { 

		//Taking Input at the time of runtime		
		int mDay = Integer.parseInt(args[0]);
		int mMonth = Integer.parseInt(args[1]);
		
		//display true if condition is true otherwise false
		boolean mIsSpringSeason = ( mDay >= 20 && mDay<= 31 && mMonth == 3) 
                                        || ( mDay >= 1 && mDay<= 30 && mMonth == 4) 
                                        || ( mDay >= 1 && mDay<= 31 && mMonth == 5) 
                                        || ( mDay >= 1 && mDay<= 20 && mMonth == 6);

		System.out.println(mIsSpringSeason);
	}
}
