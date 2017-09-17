/***************************************************************************
* Purpose : To create class for random number genration
*
* @author   Aashish
* @version  1.0
* @since    21-08-2017
****************************************************************************/
package com.bridgelabz.lib;
import java.util.Random;

public class BLRandom {

    static Random random;
    static long seed;

    //static initialization
    static {
        random = new Random();
    }

    //Sets the seed of the pseudorandom number generator.
    public static void setSeed(long sed) {
        seed = sed;
        random = new Random(seed);
    }

    //Returns a random integer between 0 and num
    public static int uniform(int num) {
        return random.nextInt(num);
    }

    //Returns a random double value between low and high
    public static double uniform(double low, double high) {
        return low + (random.nextDouble() * (high - low));
    }

    //Returns a random boolean value with probability
    public static boolean bernoulli(double probability) {
        return random.nextDouble() < probability;
    }
    // Returns a random real number from a standard Gaussian distribution.

    public static double guassian() {
        return random.nextGaussian();
    }

    // Returns a random real number from a standard Gaussian distribution.
    //with given Mean mu and standard deviation sigma
    public static double guassian(double mu, double sigma) {
        return mu + sigma * random.nextGaussian();
    }

    //Shuffles given array.
    public static void shuffle(double arr[]) {
        if (arr.length > 0) {
            double temp;
            int randomIndex;
            for (int i = 0; i < arr.length; i++) {
                randomIndex = i + random.nextInt(arr.length - i);
                temp = arr[i];
                arr[i] = arr[randomIndex];
                arr[randomIndex] = temp;
				System.out.println(arr[i]);
            }
        }
    }
	
	
public static void main(String args[])
{
	double []arr={10d,9d,5d};
	new BLRandom().shuffle(arr);
	System.out.println(guassian(2.0d,3.0d));
	System.out.println(uniform(3));
	System.out.println(uniform(3.0d,6.0d));
	
}
}
