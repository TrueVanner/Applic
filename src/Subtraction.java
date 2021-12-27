public class Subtraction implements AriphmeticAction {

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber("0");
        int maxDigits = Math.max(num1.digit, num2.digit);
        res.resetDigits(maxDigits);

        int after = 0;
        int x = num1.digit - 1;
        int y = num2.digit - 1;
        int h = num1.compareTo(num2);

        if (h == 0) {
            return new LongNumber("0");
        }

        int buf1, buf2;

        for (int i = maxDigits - 1; i >= 0; i--) {
            buf1 = x >= 0 ? num1.number[x] * h : 0;
            buf2 = y >= 0 ? num2.number[y] * h : 0;
            res.number[i] = buf1 - buf2 + after;
            after = 0;
            if (res.number[i] < 0) {
                res.number[i] += 10;
                after = -1;
            }
            x--;
            y--;
        }

        return res;
    }
}
