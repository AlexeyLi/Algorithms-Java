package Algorithms;

// Given a sentence, reverse the words in the sentence.
// For example, "i live in a house" becomes "house a in live i"

public class ReverseWordsInString {

    public String reverseWordsInString(String sentence) {
        int end = sentence.length();
        StringBuilder result  = new StringBuilder();

        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) == ' ') {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(sentence, i + 1, end);
                end = i;
            }
        }

        String firstWord = sentence.substring(0, end);
        if (result.length() > 0) {
            result.append(' ');
        }
        result.append(firstWord);
        return result.toString();
    }
    // Time: O(n)
    // Memory: O(n)
}
