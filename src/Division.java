public class Division implements AriphmeticAction {

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber();
        LongNumber num = new LongNumber(num1);
        int[] buff = new int[num1.digit];

        int com = num1.compareTo(num2);

        System.arraycopy(num.number, 0, buff, 0, 3);

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