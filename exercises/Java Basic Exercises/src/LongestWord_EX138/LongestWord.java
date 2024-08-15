/**
 * Write a Java program to find the longest words in a dictionary.
 * Example-1:
 * {
 * "cat",
 * "flag",
 * "green",
 * "country",
 * "school"
 * }
 * Result: "country"
 * Example-2:
 * {
 * "cat",
 * "dog",
 * "red",
 * "is",
 * "am"
 * }
 */
package LongestWord_EX138;

public class LongestWord {
    public static void main(String[] args) {
        
        String longestWord = ""; //this String contains the longest found word. It's initially set to a null String cause the check hasn't been done yet
        String[] words = {"cat", "flag", "green", "country", "school"};

        //using a foreach - looping over the arrays, string by string (stored in i)
        for (String i:words) {
            if(i.length() >= longestWord.length()){ //the first time will always be true - the length method return the number of characters in the string
                longestWord = i;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        
    }
}
