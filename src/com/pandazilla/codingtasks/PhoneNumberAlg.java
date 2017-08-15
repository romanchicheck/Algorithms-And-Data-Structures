package com.pandazilla.codingtasks;

/**
 * Given "00-44  48 5555 8361", the function should return "00-44  48 5555 8361".
 * Given "0 - 22 1985--324", the function should return "022-198-53-24".
 * Given "022-198-53-24", the function should return "555-372-654".
 */
public class PhoneNumberAlg {

    public PhoneNumberAlg() {
    }

    public String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!str.isEmpty() && str.length() >= 2) {
            String result = str.replaceAll("\\s", "").replaceAll("-", "");
            int start = 0;
            int end = 3;
            int groupCount = result.length() / 3;
            int remainder = result.length() - (groupCount * 3);
            if (remainder == 1) {
                groupCount--;
            }
            for (int i = 0; i < groupCount; i++) {
                if (remainder == 0 && i == groupCount - 1) {
                    stringBuilder.append(result.substring(start, end));
                } else {
                    stringBuilder.append(result.substring(start, end)).append("-");
                }
                start += 3;
                end += 3;
            }
            if (remainder == 1) {
                stringBuilder.append(result.substring(start, start + 2)).append("-").append(result.substring(end - 1, end + 1));
            } else {
                stringBuilder.append(result.substring(start));
            }
        }
        return stringBuilder.toString();
    }

}
