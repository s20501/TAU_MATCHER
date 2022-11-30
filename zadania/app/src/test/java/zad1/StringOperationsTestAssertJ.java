
package zad1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationsTestAssertJ {
    @Test
    void singlePangram() {
        StringOperations classUnderTest = new StringOperations();
        String testPalindrome = "The quick brown fox jumps over the lazy dog";

        assertTrue(classUnderTest.isPalindrome(testPalindrome));
    }

    @Test
    void singleNotPangram() {
        StringOperations classUnderTest = new StringOperations();
        String testPalindrome = "The quicsdsd over thsaddy dog";

        assertFalse(classUnderTest.isPalindrome(testPalindrome));
    }

    @Test
    void contact() {
        StringOperations classUnderTest = new StringOperations();

        assertEquals("testtest2", classUnderTest.concat("test", "test2"));
    }

    @Test
    void contactWhiteSpace() {
        StringOperations classUnderTest = new StringOperations();

        assertEquals("test  test2", classUnderTest.concat("test ", " test2"));
    }

    @Test
    void reverse() {
        StringOperations classUnderTest = new StringOperations();
        String testString = "abc";

        assertEquals("cba", classUnderTest.reverse(testString));
    }


}

