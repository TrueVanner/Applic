public class Multiplication implements AriphmeticAction {

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber(num1);

        while (num2.number[0] != 0) {
            res = Sum.action(res, num1);
            num2 = Subtraction.action(num2, new LongNumber("1"));
        }

        return res;
    }


}