package Algorithms;

import java.util.HashMap;

public class DigitCount {

    public boolean solution(String num) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            int ch = num.charAt(i) - '0';
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count;
        for (int i = 0; i < num.length(); i++) {

            if (map.containsKey(i)) {
                count = map.get(i);
            } else {
                count = 0;
            }

            int x = num.charAt(i) - '0';
            if (x != count) {
                return false;
            }
        }
        return true;
    }
}
