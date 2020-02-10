/*
 * Make a program that will accept an positive integer and return the factorial of that number.
 * Make a Factorial method recursively (receive one int parameter, return the factorial). 
 * Create a client to demonstrate it works correctly this client will demonstrate all of the recursion projects.
 * Ex.
 * Enter a positive number(-1 to end): 5
 * 5! is 120
 * Enter a positive number(-1 to end): 3
 * 3! is 6
 * Enter a positive number(-1 to end): -1
 * Thank you have a nice day:)
 *
 * Adam Browning
 * 2/10/2020
 */

import java.util.ArrayList;
public class RecursionMethods {    
    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return (x * factorial(x-1)); 
        }
    }
    
    public static int arraySum(ArrayList<Integer> x, int y) {
        if (y == x.size()-1) {
            return x.get(y);
        } else {
            return (x.get(y) + arraySum(x, ++y));
        }
    }
}
