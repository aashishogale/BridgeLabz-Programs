
/***************************************************************************
* Purpose : to create a class for forming String  function
*
*@author : Aashish
*@version : 1.8.0
*@since : 18-08-2017
****************************************************************************/



package com.bridgelabz.lib;

import java.util.Arrays;


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

    public static void itPermutation(String name) {
        char[] array = name.toCharArray();
        char temp, temp1;
        int j = 0;

        for (int k = 0; k < array.length - 1; k++) {
            temp1 = array[0];
            array[0] = array[k + 1];
            array[k + 1] = temp1;

            System.out.println(Arrays.toString(array));
            for (j = 0; j < array.length; j++) {

                for (int i = j; i < array.length - 1; i++) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    

                }

                System.out.println(Arrays.toString(array));

            }
          
        }
    }

    public static boolean isAnagram(String string1, String string2) {
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        int count = 0;
        if (array1.length != array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }
        return count == array1.length;

    }

    public static void main(String args[]) {
itPermutation("abcd");

    }

}