/*
 * Client for recursion
 *
 * Adam Browning
 * 2/10/2020
 */

import java.util.ArrayList;
import java.util.Scanner;
public class RecursionClinet
{
    public static void main() {
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> arraySumList = new ArrayList<Integer>();
        arraySumList.add(1);
        arraySumList.add(5);
        arraySumList.add(7);
        arraySumList.add(8);
        arraySumList.add(12);
        
        
        System.out.print("         Recursion\n\nA) Factorial\nB) Array Sum\nC) Even Count\nD) Euclid\nEnter Any Other Key To Exit\n");
        String response = input.nextLine();
        
        System.out.print(RecursionMethods.arraySum(arraySumList, 0));
        
        // if (response.equalsIgnoreCase("A")) {
            // System.out.print("\fEnter a number to factorial: ");
            // int factorialResponse = input.nextInt();
            // System.out.print(factorialResponse + "! = " + RecursionMethods.factorial(factorialResponse));
            
        // } else if (response.equalsIgnoreCase("B")) {
            
        // } else if (response.equalsIgnoreCase("C")) {
            
        // } else if (response.equalsIgnoreCase("D")) {
            
        // } else {
            // System.out.print("\fExiting...");
            // System.exit(0);
        // }   
        
        
        
        
        
    }
}
