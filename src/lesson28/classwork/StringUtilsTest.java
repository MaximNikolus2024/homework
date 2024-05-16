package lesson28.classwork;

import lesson27.classwork.StringUtils;
import lesson27.classwork.example01.StringUtilsImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private static StringUtils utils;

    @BeforeAll
    public static void init() {
        utils = new StringUtilsImpl();
    }

    @Test
    public void isPalindromeReturnsTrueForPalindrome() {
        assertTrue(utils.isPalindrome("12:21"));
        assertTrue(utils.isPalindrome("123321"));
        assertTrue(utils.isPalindrome("tenet"));
    }

    @Test
    public void isPalindromeReturnsFalseForNonPalindrome() {
        assertFalse(utils.isPalindrome("123456"));
        assertFalse(utils.isPalindrome("Hello"));
        assertFalse(utils.isPalindrome("How are you"));
    }

    @Test
    public void isPalindromeReturnsTrueForSingleChar() {
        assertTrue(utils.isPalindrome("1"));
    }

    @Test
    public void isPalindromeReturnsFalseForEmptyString() {
        assertTrue(utils.isPalindrome(""));
    }

   // @Test
   // public void isPangramReturnTrueForPangrams() {
   //     assertTrue(utils.isPalindrome("The quick brown fox jumps over the lazy dog"));
  //  }

    @Test
    public void isPangramReturnFalseForNonPangrams() {
        assertFalse(utils.isPalindrome("Hello world!"));
    }

 // @Test
    //public void isPangramReturnFalseForEmptyString() {
   //     assertFalse(utils.isPalindrome(""));
   // }

    @Test
    public void countOccurenciesCountLetter() {
        assertEquals(3, utils.countOccurencies("Hello world", 'l'));
        assertEquals(1, utils.countOccurencies("1234548", '2'));
    }

    @Test
    public void countOccurenciesReturnsZeroWhenCharNotPresent() {
        assertEquals(0, utils.countOccurencies("1234548", 'a'));
    }

    @Test
    public void countOccurenciesReturnZeroForEmptyString(){
        assertEquals(0,utils.countOccurencies("",'1'));
    }
    @Test
    public void countOccurenciesReturnZeroForNull(){
        assertEquals(0,utils.countOccurencies(null,'1'));
    }
    @Test
    public void reversWorks(){
        assertEquals("dlrow olleH", utils.reverse("Hello world"));
    }
    @Test
    public void reversReturnsSameStringForSingleLetter(){
        String s = "a";
        assertEquals(s,utils.reverse(s));

    }
    @Test
    public void reverseReturnsEmptyString(){
        assertEquals("",utils.reverse(""));
    }
    @Test
    public void wordReverseWork(){
        assertEquals("world hello",utils.wordReverse("hello world"));
    }
  //  @Test
  //  public void wordReversReturnsSameStringForSingleWord(){
   //     String s = "word";
  //      assertEquals();
  //  }
}
