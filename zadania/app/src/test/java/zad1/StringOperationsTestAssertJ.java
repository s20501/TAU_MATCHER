
package zad1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringOperationsTestAssertJ {
    @Test
    void singlePangram() {
        StringOperations classUnderTest = new StringOperations();
        String testPalindrome = "The quick brown fox jumps over the lazy dog";

        assertThat(classUnderTest.isPalindrome(testPalindrome)).isTrue();
    }

    @Test
    void singleNotPangram() {
        StringOperations classUnderTest = new StringOperations();
        String testPalindrome = "The quicsdsd over thsaddy dog";

        assertThat(classUnderTest.isPalindrome(testPalindrome)).isFalse();
    }

    @Test
    void contact() {
        StringOperations classUnderTest = new StringOperations();

        assertThat(classUnderTest.concat("test", "test2")).isEqualTo("testtest2");
    }

    @Test
    void contactWhiteSpace() {
        StringOperations classUnderTest = new StringOperations();

        assertThat(classUnderTest.concat("test ", " test2")).isEqualTo("test  test2");
    }

    @Test
    void reverse() {
        StringOperations classUnderTest = new StringOperations();
        String testString = "abc";

        assertThat(classUnderTest.reverse(testString)).isEqualTo("cba");
    }


}

