/**
 * Write a Java program to print the sum of two numbers.
 * Test Data:
 * 74 + 36
 * Expected Output :
 * 110
 */
package SumNumbers_EX2;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner userIn = new Scanner(System.in); //sets up Scanner to accept user input from console stream

        System.out.println("\nEnter num1: ");
        num1 = userIn.nextInt(); //scan the first input as an int

        System.out.println("\nEnter num2: "); //scan the second input as an int
        num2 = userIn.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
    }
}
