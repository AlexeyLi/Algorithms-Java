package Algorithms;

public class LengthOfLastWord {

    public int solution(String s) {
        String[] t = s.split(" ");

        return t[t.length - 1].length();
    }
}
