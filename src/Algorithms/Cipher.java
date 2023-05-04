package Algorithms;

public class Cipher {

    public String solution(String s) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder stringBuilder = new StringBuilder();

        for (Character c: s.toCharArray()) {
            if (c == 'A') {
                stringBuilder.append('Y');
            } else if (c == 'B') {
                stringBuilder.append('Z');
            } else {
                stringBuilder.append(alphabet.toCharArray()[alphabet.indexOf(c) - 2]);
            }
        }

        return stringBuilder.toString();
    }
}
