public class Multiplication implements AriphmeticAction {

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber();
        LongNumber zero = new LongNumber();

        while (num2.compareTo(zero) != 0) {
            res = Addition.action(res, num1);
            num2 = Subtraction.action(num2, new LongNumber("1"));
        }

        return res;
    }


}