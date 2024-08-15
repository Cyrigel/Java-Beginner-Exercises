/**
 * Write a Java program to print 'Hello' on screen and your name on a separate line.
 * Expected Output :
 * Hello
 * Alexandra Abramov
 */

package HelloProgram_EX1;


import java.util.Scanner;

public class HelloProgram {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in); //sets up the Scanner to read data from user input - System.in is the console stream
        String name = userIn.nextLine(); //create String to store the input

        System.out.println("Hello\n" + name);
    }
}
