package Algorithms;

public class SimplifyPath {

    public int climbStairs(int n) {
        if(n < 2){
            return n;
        }

        int first  = 1;
        int second = 2;
        int tmp = 0;

        for(int i = 3; i <= n; i++) {
            tmp = second;
            second += first;
            first = tmp;
        }
        return second;
    }

    public int climbStairsFibonacci(int n) {

        if (n <= 2) {
            return n;
        } else {
            return (climbStairsFibonacci(n - 1 ) + climbStairsFibonacci(n - 2));
        }
    }
}
