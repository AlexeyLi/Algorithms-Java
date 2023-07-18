package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {

    public int solution(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int n = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                n = entry.getKey();
            }
        }

        if (n == 0) {
            return -1;
        }

        return n;
    }
    // Time: O(n)
    // Memory: O(n^2)
}
