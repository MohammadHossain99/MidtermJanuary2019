package string.problems;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


            String original, reverse = ""; // Objects of String class
            Scanner in = new Scanner(System.in);

            System.out.println("Enter a string to check if it is a palindrome");
            original = in.nextLine();

            int length = original.length();

            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);

            if (original.equals(reverse))
                System.out.println("The string is a palindrome.");
            else
                System.out.println("The string isn't a palindrome.");

        }
        public static boolean isPalinedrome(String word) {

            for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
                }
            }
        return true;
        }

    }

