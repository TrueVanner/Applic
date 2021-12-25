public class Division implements AriphmeticAction {

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber();
        LongNumber num = new LongNumber(num1);

        while (num != null) {
            num = Subtraction.action(num, num2);
            res = Addition.action(res, new LongNumber("1"));
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