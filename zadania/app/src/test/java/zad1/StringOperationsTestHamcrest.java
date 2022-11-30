
package zad1;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class StringOperationsTestHamcrest {
    @Test
    void singlePangram() {
        StringOperations classUnderTest = new StringOperations();

        String testPalindrome = "The quick brown fox jumps over the lazy dog";

        assertThat(classUnderTest.isPalindrome(testPalindrome), equalTo(true));
    }

    @Test
    void singleNotPangram() {
        StringOperations classUnderTest = new StringOperations();
        String testPalindrome = "The quicsdsd over thsaddy dog";

        assertThat(classUnderTest.isPalindrome(testPalindrome), equalTo(false));
    }

    @Test
    void contact() {
        StringOperations classUnderTest = new StringOperations();

        assertThat(classUnderTest.concat("test", "test2"), hasToString("testtest2"));
    }

    @Test
    void contactWhiteSpace() {
        StringOperations classUnderTest = new StringOperations();

        assertThat(classUnderTest.concat("test ", " test2"), equalTo("test  test2"));


    }

    @Test
    void reverse() {
        StringOperations classUnderTest = new StringOperations();
        String testString = "abc";

        assertThat(classUnderTest.reverse(testString), equalTo("cba"));
    }


}

