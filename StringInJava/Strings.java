package DataStucture.StringInJava;

import java.util.Arrays;

import DataStucture.List.ArrayList;

public class Strings {

    private static String swapTwoCharacters(String s, char c1, char c2) {
        String newString = "";
        char temp = c1;
        c1 = c2;
        c2 = temp;
        newString.concat("raju");
        return newString;
    }

    public static String reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    public static boolean palindrom(String s) {
        int end = s.length() - 1;
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) != s.charAt(end - i)) {
                return false;
            }
        }
        return true;
    }

    // {"sister"}
    public static int maxOccuringCharacter(String s) {
        int[] charCount = new int[256];

        int maxIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c] = charCount[c] + 1;
            if (charCount[maxIndex] < charCount[c]) {
                maxIndex = c;
            }
        }
        return maxIndex;
    }

    private static boolean isPresent(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static String removeDuplicate(String s) {
        String tempString = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!isPresent(tempString, temp)) {
                tempString += s.charAt(i);
            }
        }
        return tempString;
    }

    public static boolean checkIfStringIsRotaionOfOther(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s = s1;
        for (int i = 0; i < s1.length(); i++) {
            s = rotate(s);
            if (s.equals(s2))
                return true;
        }
        return false;

    }

    private static String rotate(String s) {
        char[] ch = s.toCharArray();
        char temp = ch[0];
        for (int i = 1; i < ch.length; i++) {
            ch[i - 1] = ch[i];
        }
        ch[ch.length - 1] = temp;
        return new String(ch);
    }

    public static String printNonRepatingCharacters(String s) {
        int[] ch = new int[256];
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i)] += 1;
        }
        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 1) {
                s1 = s1.append((char) i);
            }
        }
        return s1.toString();
    }
}
