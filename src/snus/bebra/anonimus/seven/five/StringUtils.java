package snus.bebra.anonimus.seven.five;

import java.util.Collections;

public interface StringUtils {
    static int count(String s) {
        return s.length();
    }

    static String oddSymbols(String s) {
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
            if (i % 2 == 0)
                ret.append(s.charAt(i));

        return ret.toString();
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
