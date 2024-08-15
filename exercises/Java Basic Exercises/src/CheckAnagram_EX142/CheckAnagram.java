/**
 * Write a Java program to check if two strings are anagrams or not.
 * According to Wikipedia "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word anagram can be rearranged into nag a ram, or the word binary into brainy."
 * Sample Output: String-1 : wxyz
 * String-2 : zyxw
 * Check if two given strings are anagrams or not?: true
 */


package CheckAnagram_EX142;

public class CheckAnagram {
    public static void main(String[] args) {
        boolean flag = false;
        String word1 = "wxyz";
        String word2 = "zyxw";

        String[] characters1 = word1.split("(?!^)"); //negative lookahead regex expression
        String[] characters2 = word2.split("(?!^)");

        //of course is always false because the two words are already stored in their variables
        if(word1.length() != word2.length()){
            System.out.println("\nThe two words aren't anagrams. Length is not the same");
        }
        else {
            //loop into the first array
            for(int i=0; i<characters1.length; i++){

                //loop into the second array
                for (int j=0; j < characters2.length; j++){
                    if(characters1[i].equals(characters2[j])){  //checks if the letter of the first array is equal to the current letter of the second one
                        System.out.println("character founded.\n");
                        flag = true; //flags to true
                    }



                }

                if(!flag){  //if flag is false = the previous loop didn't find matches
                    System.out.println("The two words aren't anagrams.\n");
                    break;
                } else if ((flag) && i == (characters1.length-1)) { //if flag is true AND the looping in the first array is completed
                    System.out.println("The two words are anagrams.\n");

                }


            }
        }

    }
}
