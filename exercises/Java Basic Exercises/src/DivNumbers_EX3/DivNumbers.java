/**
 * Write a Java program to divide two numbers and print them on the screen.
 * Test Data :
 * 50/3
 * Expected Output :
 * 16
 */

package DivNumbers_EX3;

import java.util.Scanner;

public class DivNumbers {
    public static void main(String[] args) {

        int num1, num2;

        Scanner userIn = new Scanner(System.in);

        System.out.println("\nEnter first number:");
        num1 = userIn.nextInt();

        System.out.println("\nEnter second number:");
        num2 = userIn.nextInt();

        System.out.println(((float)num1/(float)num2)); //you need to cast into float to have a proper division, otherwise the result will be rounded into an integer

    }
}
