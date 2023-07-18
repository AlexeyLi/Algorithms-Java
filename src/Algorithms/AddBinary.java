package Algorithms;

public class AddBinary {

    public String solution(String a, String b) {

        StringBuilder stringBuilder = new StringBuilder();

        int sum = 0;
        int y = 1;
        int i = a.length() - 1;
        int j = b.length() - 1;

        // From binary to decimal
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                sum += (a.charAt(i) - '0') * y;
                i -= 1;
            }

            if (j >= 0) {
                sum += (b.charAt(j) - '0') * y;
                j -= 1;
            }
            y *= 2;
        }

        // From decimal to binary
        if (sum == 0) {
            return "0";
        } else {
            while (sum != 0) {
                stringBuilder.append(sum % 2);
                sum = sum / 2;
            }
        }

        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
