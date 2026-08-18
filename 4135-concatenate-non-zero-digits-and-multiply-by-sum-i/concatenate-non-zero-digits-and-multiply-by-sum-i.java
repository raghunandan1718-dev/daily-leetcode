class Solution {
    public long sumAndMultiply(int n) {

        if (n == 0) {
            return 0;
        }

        long x = 0;
        long sum = 0;

        for (char ch : String.valueOf(n).toCharArray()) {

            int digit = ch - '0';

            if (digit != 0) {
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }
}