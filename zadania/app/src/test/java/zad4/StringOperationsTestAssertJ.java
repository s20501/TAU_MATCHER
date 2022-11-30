
package zad4;

import org.junit.jupiter.api.Test;
import zad1.StringOperations;

import static zad4.StringOperationsAssert.assertThat;

class StringOperationsTestAssertJ {


    @Test
    void contact() {
        StringOperations classUnderTest = new StringOperations();

        assertThat(classUnderTest).onlyDigits("123");
    }


}

