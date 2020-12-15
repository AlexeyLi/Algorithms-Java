package Algorithms;

/*  1. Input: What is the input parameter?
    2. Output: What is the datatype of your answer that your function has to return?
    3. What data structures and methods associated with it will be used?
    4. Where are you going to store temporary data (if needed)?
    5. Describe the model of your algorithm before implementing the solution in code.
    6. Write unit tests for your solution - think about edge cases.
    7. Runtime complexity?
    8. Memory complexity?
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostRepeatedChar {

    // Please find the most repeated char in a string
    public static Character mostRepeatedChar(String str) {
        if (str.isEmpty()) {
            return '0';
        }

        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (chars.containsKey(str.charAt(i))) {
                chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
            } else {
                chars.put(str.charAt(i), 1);
            }
        }

        Iterator it = chars.entrySet().iterator();
        int maxValue = 0;
        Character character = str.charAt(0);
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if ((Integer)pair.getValue() > maxValue) {
                maxValue = (Integer)pair.getValue();
                character = (Character)pair.getKey();
            }
        }

        return character;
    }

}
