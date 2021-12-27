public class Division implements AriphmeticAction {

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber();

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
            System.out.println(b);

            while (b.compareTo(num2) >= 0) {
                b = Subtraction.action(b, num2);
                res.number[i]++;
                b.removeZeros();
            }

            System.out.println(b);

            while (b.compareTo(num2) < 0) {
                b.addDigits(1);
                b.number[b.digit - 1] = num1.number[num2.digit + j];
                j++;
            }

            System.out.println(b);
            System.out.println(res);

            buff = new int[b.digit];
            System.arraycopy(b.number, 0, buff, 0, b.digit);

            res.addDigits(1);
            i++;
            System.out.println("\n");
        }

        b = new LongNumber(buff);

        while (b.compareTo(num2) >= 0) {
            b = Subtraction.action(b, num2);
            res.number[i]++;
            b.removeZeros();
            System.out.println(b);
        }

        return res;
    }
}
    /*
    div

    12 / 3 = 4

    num1 , num2, res // COPY NUM! AND NUM2

    while(num1 > 0){
        num1 = num1 - num2;
        res++;
    }

      return res;
*/