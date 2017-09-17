/***************************************************************************
* Purpose : Library of statistical functions that takes array of real numbers from standard input,
*           and computes the minimum, mean, maximum and standard deviation. 
*
* @author   Aashish
* @version  1.0
* @since    18-08-2017
****************************************************************************/
package com.bridgelabz.lib;
public class BLStats {

    //find maximum number
    public static double max(double[] a) {
        double maximum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        return maximum;
    }

    //find minimum number
    public static double min(double[] a) {
        double minimum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        return minimum;
    }
    
    //find minimum number
    public static double mean(double[] a) {
        double mean = 0;
        for (int i = 0; i < a.length; i++) {
            mean += a[i];
        }
        mean = mean / a.length;
        return mean;
    }

    //find median of number
    public static double median(double[] a) {
        double temp;
        double median;
        int mIndex;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		mIndex = a.length / 2;
		if(a.length%2==0){
			median=(a[mIndex+-1]+a[mIndex])/2;
			return median;
			
		}
		else {
			
        
        median = a[mIndex];
        return median;
		}

    }
   
    //find variance of number
    public static double var(double[] a) {
        double mean = mean(a);
        double sum = 0;
        int i;
        for (i = 0; i < a.length; i++) { 
            sum += Math.pow((a[i] - mean), 2);
        }
        sum = sum / a.length;
        return sum;
    }

   //find standard deviation
   public static double stddev(double[] a){
		double variance = Math.sqrt(var(a));
		return variance;
   }
	
    
   public static void main(String[] args)
	{
		 double []arr={1.0d,2.0d,3.0d,4.0d};
		System.out.println(median(arr));
	}
}