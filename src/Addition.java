public class Addition implements AriphmeticAction {

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber();
        int maxDigit = Math.max(num1.digit, num2.digit);
        res.setDigit(maxDigit + 1);
        int x = num1.digit - 1;
        int y = num2.digit - 1;
        int after = 0;

        int buf1, buf2;

        for (int i = maxDigit; i > 0; i--) {
            buf1 = x >= 0 ? num1.number[x] : 0;
            buf2 = y >= 0 ? num2.number[y] : 0;

            res.number[i] = buf1 + buf2 + after;
            after = 0;
            if (res.number[i] >= 10) {
                after = 1;
                res.number[i] -= 10;
            }
            x--;
            y--;
        }
        return res;
    }
}