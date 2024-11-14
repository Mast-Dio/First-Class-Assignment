import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {

        @Test
        public void testIsPrime() {
            assertTrue(NumberUtils.isPrime(2));     // Prime number
            assertTrue(NumberUtils.isPrime(13));    // Prime number
            assertFalse(NumberUtils.isPrime(1));    // Not prime
            assertFalse(NumberUtils.isPrime(4));    // Not prime
            assertFalse(NumberUtils.isPrime(-3));   // Not prime (negative)
        }

        @Test
        public void testIsPalindrome() {
            assertTrue(StringUtils.isPalindrome("airforce"));    // Palindrome
            assertTrue(StringUtils.isPalindrome("swallow"));      // Palindrome
            assertFalse(StringUtils.isPalindrome("jollofrice"));     // Not a palindrome
            assertFalse(StringUtils.isPalindrome(null));        // Null should return false
            assertTrue(StringUtils.isPalindrome(""));           // Empty string is a palindrome
        }


}