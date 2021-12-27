public class Division implements AriphmeticAction {

    public LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber();
        Subtraction sub = new Subtraction();

        if (num1.compareTo(num2) == -1) {
            throw new Error("First number must be greater than the second one");
        }
        if (num1.compareTo(num2) == 0) {
            return new LongNumber("1");
        }

        int[] buff = new int[num2.digit];
        LongNumber b;
        int i = 0, j = 0;

        System.arraycopy(num1.number, 0, buff, 0, num2.digit);

        while (num2.digit + j < num1.digit) {
            b = new LongNumber(buff);

            while (b.compareTo(num2) >= 0) {
                b = sub.action(b, num2);
                res.number[i]++;
                b.removeZeros();
            }


            while (b.compareTo(num2) < 0) {
                b.addDigits(1);
                b.number[b.digit - 1] = num1.number[num2.digit + j];
                j++;
            }


            buff = new int[b.digit];
            System.arraycopy(b.number, 0, buff, 0, b.digit);

            res.addDigits(1);
            i++;
        }

        b = new LongNumber(buff);

        while (b.compareTo(num2) >= 0) {
            b = sub.action(b, num2);
            res.number[i]++;
            b.removeZeros();
        }

        return res;
    }
}
