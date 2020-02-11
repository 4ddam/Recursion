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
        ArrayList<Integer> List = new ArrayList<Integer>();

        System.out.print("         \fRecursion\n\nA) Factorial\nB) Array Sum\nC) Even Count\nD) Euclid\nEnter Any Other Key To Exit\n");
        String response = input.nextLine();

        if (response.equalsIgnoreCase("A")) {
            while (true) {
                System.out.print("\nFactorial - Enter a number to factorial. Enter -1 to end: ");
                int factorialResponse = input.nextInt();
                if (factorialResponse == -1) {
                    break;
                }   
                System.out.println(factorialResponse + "! = " + RecursionMethods.factorial(factorialResponse));                              
            }
        } else if (response.equalsIgnoreCase("B")) {
            while (true) {
                System.out.print("\nArray Sum - Enter a number too add to the list. Enter -1 to end: ");
                int arraySumResponse = input.nextInt();
                if (arraySumResponse == -1) {
                    break;
                } else {
                    List.add(arraySumResponse);
                }
            }
            System.out.print("= " + RecursionMethods.arraySum(List, 0));
            System.out.print("\nEnter any key to end");
            input.nextLine();
            input.nextLine();

        } else if (response.equalsIgnoreCase("C")) {
            while (true) {
                System.out.print("\nEven Count - Enter a number too add to the list. Enter -1 to end: ");
                int evenCountResponse = input.nextInt();
                if (evenCountResponse == -1) {
                    break;
                } else {
                    List.add(evenCountResponse);
                }
            }
            System.out.print("= " + RecursionMethods.evenCount(List, 0));
            System.out.print("\nEnter any key to end");
            input.nextLine();
            input.nextLine();
        } else if (response.equalsIgnoreCase("D")) {
            System.out.print("\nFactorial - Enter the first number to find the GCD of: ");
            int firstNumber = input.nextInt();
            System.out.print("\nFactorial - Enter the second number to find the GCD of: ");
            int secondNumber = input.nextInt();
            System.out.print("GCD(" + firstNumber + "," + secondNumber + ") = " + RecursionMethods.Euclid(firstNumber, secondNumber));
            System.out.print("\nEnter any key to end");
            input.nextLine();
            input.nextLine();
        } 
        System.out.print("\fClient Closed...");
        System.exit(0);

    }
}
