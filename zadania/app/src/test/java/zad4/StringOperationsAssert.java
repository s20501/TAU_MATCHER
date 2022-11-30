package zad4;

import org.assertj.core.api.AbstractAssert;
import zad1.StringOperations;

public class StringOperationsAssert extends AbstractAssert<StringOperationsAssert, StringOperations> {
    public StringOperationsAssert(StringOperations actual) {
        super(actual, StringOperationsAssert.class);
    }

    public StringOperationsAssert onlyDigits(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            failWithMessage("Only digits");
        }
        return this;
    }

    public static StringOperationsAssert assertThat(StringOperations actual) {
        return new StringOperationsAssert(actual);
    }
}
