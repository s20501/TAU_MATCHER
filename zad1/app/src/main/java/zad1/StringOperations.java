package zad1;


import java.util.ArrayList;
import java.util.List;

public class StringOperations {

    public String reverse(String a) {
        List<String> tempArray = new ArrayList<String>(a.length());
        for (int i = 0; i < a.length(); i++) {
            tempArray.add(a.substring(i, i + 1));
        }
        StringBuilder reversedString = new StringBuilder(a.length());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

    public String concat(String a, String b) {
        String retVal = null;
        if (a != null && a.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            if (b != null) {
                sb.append(b);
            }
            retVal = sb.toString();
        }
        return retVal;
    }

    public boolean isPalindrome(String str) {
        boolean[] letterCheck = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            letterCheck[index] = true;
        }

        boolean allNumbersChecks = true;


        for (int i = 0; i <= 25; i++) {
            if (letterCheck[i] == false) {
                allNumbersChecks = false;
            }
        }
        return allNumbersChecks;
    }

}