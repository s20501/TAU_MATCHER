
package zad4;

import org.junit.jupiter.api.Test;
import zad1.StringOperations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static zad4.IsOnlyDigits.onlyDigits;


class StringOperationsTestHamcrest {


    @Test
    void contact() {
        StringOperations classUnderTest = new StringOperations();

        assertThat(classUnderTest.concat("123", "456"), is(onlyDigits()));
    }


}

