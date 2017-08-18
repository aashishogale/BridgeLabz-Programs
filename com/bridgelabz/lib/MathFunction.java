
/***************************************************************************
* Purpose : to create a class for forming math function
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/



package com.bridgelabz.lib;
public class MathFunction {

    public static double harmonicNumber(double mNumber) {

        double nharmonic = mNumber;

        //use float to get result
        float result = 0;

        // use for loop to calculate the harmonic no
        for (float i = 1; i <= nharmonic; i++) {

            result = result + (1 / i);
            System.out.print("1/" + i + "+");
        }
        return result;
    }

    //function for calculating factorial
    public static double factorial(double no) {

        double fact = 1;
        for (double i = no; i > 0; i--) {
            fact = fact * i;
        }//end of loop

        return fact;
    }

    public static double sinAngle(double original) {

        double angle = original;
        angle = angle % (2 * Math.PI);

        //declare double variable for factorial and sinx and denominator
        double fact = 0;
        double sinx = 0;

        //declare integer variable for count
        int count = 0;
        int flag = 0;
        double deno = 1;

        //initialize loop
        while (count < 5) {

            //condition for adding
            if (flag == 0) {

                fact = factorial(deno);
                sinx = sinx + (Math.pow(angle, deno) / fact);
                deno += 2;
                flag = 1;
            } else {

                sinx = sinx - (Math.pow(angle, deno) / factorial(deno));
                deno += 2;
                flag = 0;
            }

            count++;

        }//end of loop

        return sinx;
    }

    public static double cosAngle(double original) {
        double angle = original;
        angle = angle % (2 * Math.PI);

        //declare double variable for factorial and sinx and denominator
        double fact = 0;
        double cosx = 0;

        //declare integer variable for count
        int count = 0;
        int flag = 0;
        double deno = 0;

        //initialize loop
        while (count < 5) {

            //condition for adding
            if (flag == 0) {

                System.out.println(cosx);
                fact = factorial(deno);
                cosx = cosx + (Math.pow(angle, deno) / fact);
                deno += 2;
                flag = 1;
            } else {

                cosx = cosx - (Math.pow(angle, deno) / factorial(deno));
                deno += 2;
                System.out.println(cosx);
                flag = 0;

            }
            count++;

        }//end of loop

        return cosx;

    }

    public static String binary(int number) {

        //takes the command line argument from user
        int nNumber = number;

        int mDivision = 1;

        int counter = 0;
        String newNumber = "";

        //find the power of 2 from small to large
        while (mDivision <= nNumber / 2) {
            mDivision *= 2;

        }

        //prints the binary number from large to small
        while (mDivision > 0) {

            if (counter == 4) {
                System.out.print(" ");
                counter = 0;

            }

            if (nNumber < mDivision) {

                newNumber += "0";
                counter++;
            } else {

                newNumber += "1";
                nNumber -= mDivision;

                counter++;
            }

            mDivision /= 2;

        }

        return newNumber;
    }

    public static double sqrt(double number) {

        double c = number;

        double epsilon = 1e-15;

        double t = c;

        //loop until condition is satisfied
        while (Math.abs(t - c / t) > epsilon * t) {

            t = (c / t + t) / 2.0;

        }

        return t;
    }

    public static double sqrt(double number, double epsilon) {

        double c = number;

        double t = c;

        //loop until condition is satisfied
        while (Math.abs(t - c / t) > epsilon * t) {

            t = (c / t + t) / 2.0;

        }

        return t;
    }

    public static boolean checkPrime(int n) {

        //condition to check if no less than two
        if (n < 2) {
            return false;
        }

        //for loop to for checkin prime no
        for (int factor = 2; factor * factor <= n; factor++) {
            // if factor divides evenly into n, n is not prime, so break out of loop
            if (n % factor == 0) {
                return false;

            }
        } // End of for loop
        return true;
    }

    //function for calculating factorial
    public static long factorial(int no) {

        long fact = 1;
        for (long i = no; i > 0; i--) {
            fact = fact * i;
        }//end of loop

        return fact;
    }

    public static double futureVal(double capital, double rate, double period) {
        double futureValue;
        futureValue = capital * Math.pow((1 + rate), period);
        return futureValue;
    }

    public static double presentVal(double capital, double rate, double period) {
        double presentValue;
        presentValue = capital * Math.pow((1 + rate), period);
        return presentValue;
    }

    public static int maxValue(int[] numbers) {

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }
        return largest;

    }

    public static int minValue(int[] numbers) {
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }

        return smallest;
    }

    public static int minValue(String snumbers[]) {

        int i;
        int[] numbers = new int[snumbers.length];

        for (i = 1; i < snumbers.length; i++) {
            numbers[i] = Integer.parseInt(snumbers[i]);

        }

        int smallest = numbers[0];

        for (i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }

        return smallest;
    }

    public static int maxValue(String snumbers[]) {
        int i;
        int[] numbers = new int[snumbers.length];

        for (i = 1; i < snumbers.length; i++) {
            numbers[i] = Integer.parseInt(snumbers[i]);

        }
        int largest = numbers[0];

        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }
        return largest;

    }

    public static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB = (y2 - y1) / (x2 - x1);
        int slopeBC = (y3 - y2) / (x3 - x2);
        int slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAC == slopeAB && slopeAB == slopeBC;
    }

    public static boolean checkCollinearUsingTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int det = (x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2);
        return det / 2 == 0;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
