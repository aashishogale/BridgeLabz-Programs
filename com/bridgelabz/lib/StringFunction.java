
/***************************************************************************
* Purpose : to create a class for forming String  function
*
*@author : Aashish
*@version : 1.8.0
*@since : 18-08-2017
****************************************************************************/



package com.bridgelabz.lib;




public class StringFunction {

 
    public static boolean checkPalindrome(String name1) {
        char[] array1 = name1.toCharArray();
        int j = array1.length - 1;
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array1[j]) {
                counter++;
                j--;
            }
        }
        return counter == array1.length;
    }

  
   public static void permutate(String permString) {
        int number = permString.length();
        char[] permArray = new char[number];
        for (int i = 0; i < number; i++)
            permArray[i] = permString.charAt(i);
        permutate(permArray, number);
    }

    private static void permutate(char[] permArray, int number) {
        if (number == 1) {
            System.out.println(new String(permArray));
            return;
        }
        for (int i = 0; i < number; i++) {
            swap(permArray, i, number-1);
            
           permutate(permArray, number-1);
            
            swap(permArray, i, number-1);

        }
    }  

    
    private static void swap(char[] permArray, int i, int j) {

        char temp = permArray[i];
        permArray[i] = permArray[j];
        permArray[j] = temp;

         
    }
	
//convert to character array
	public static int[] convert(char firArray[],int firAscii[])
	{
	 for (int i = 0; i < firArray.length; i++) {
				 
					firAscii[i]=(int)firArray[i];
				}
	return firAscii;
			

	}

//sort the character array
	public static int[] sort(int firAscii[])
	{
			 int temp=0;
			  for(int i=0; i < firAscii.length; i++){
					 for(int j=1; j < (firAscii.length-i); j++){
							  if(firAscii[j-1] > firAscii[j]){  
								   
									 temp = firAscii[j-1];  
									 firAscii[j-1] = firAscii[j];  
									 firAscii[j] = temp;  
							 } 
						}

				}
	return firAscii;
	}

//convert to lower case
	public static String toLowerCase(String string1)
	{
	
		String s2="",s3="";
		int aChar=0;
		for (int i = 0; i< string1.length(); i++){

			aChar = (int)string1.charAt(i);
			if (65 <= aChar && aChar<=90){
			s3 = Character.toString((char)( (aChar + 32) )); 
			s2=s2+s3;
			}

			else{
			s3 = Character.toString((char)( (aChar) )); 
			s2=s2+s3;

			}  
		   }
		return s2;
		 }


    public static boolean isAnagram(String firString, String secString) {

        firString=toLowerCase(firString);
        secString=toLowerCase(secString);
        char[] firArray = firString.toCharArray();
        char[] secArray = secString.toCharArray();
        int firAscii[]=new int[firArray.length+1];
        int secAscii[]=new int[secArray.length+1];
        
        if (firArray.length != secArray.length) {
            return false;
        }

      
        int count = 0;  
        firAscii=convert(firArray,firAscii);
        secAscii=convert(secArray,secAscii);
        firAscii=sort(firAscii);
        secAscii=sort(secAscii);   
       
        for (int i = 0; i < firAscii.length; i++) {
            if (firAscii[i] == secAscii[i]) {
                count++;
            }
        }
        return count == firAscii.length;

    }


    public static void main(String args[]) {
   
     System.out.println(isAnagram("Avaj1","java1"));
     permutate("abc");

     

    }

}
