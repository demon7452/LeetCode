package com.huawei.medium.zString;

import java.util.HashMap;
import java.util.Map;

public class First {

    public static void main(String[] args) {
        convert("PAYPALISHIRING" , 3);
    }

    private static String convert(String s, int numRows) {
        if (s.length() < numRows || numRows == 1) {
            return s;
        }

        Map<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
        for (int i = 1; i <= numRows; i++) {
            map.put(i, new StringBuilder());
        }
        int i = 1;
        boolean isRevert = false;
        for (char c : s.toCharArray()) {
            map.get(i).append(c);
            if (i == 1) {
                isRevert = false;
            }
            if (i == numRows) {
                isRevert = true;
            }
            if (isRevert) {
                i--;
            }else {
                i++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int j = 1; j <= numRows; j++) {
            result.append(map.get(j));
        }
        return result.toString();
    }
}
