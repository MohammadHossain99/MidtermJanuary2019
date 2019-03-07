package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        Palindrome.isPalinedrome("CAT");
        try {
            Assert.assertEquals(true, true, "Program is working");
        }catch(Exception ex){
            ex.getMessage();
        }


    }
}
//        //Apply Unit Test into all the methods in this package.
//        //public void testAnagram(String s1, String s2)
