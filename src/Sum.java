public class Sum implements AriphmeticAction{
    LongNumber num1;
    LongNumber num2;

    LongNumber res;

    public static LongNumber action(LongNumber num1, LongNumber num2){
        LongNumber res = new LongNumber("");
        int maxDigits = num1.digit > num2.digit?num1.digit: num2.digit;
        res.setDigit(maxDigits+1);
        int x = num1.digit-1;
        int y = num2.digit-1;
        int after = 0;

        for (int i = maxDigits; i >= 0; i--) {
            int buf1= x>=0?num1.number[x]:0, buf2 = (y)>=0?num2.number[y]:0;
            res.number[i] = buf1 + buf2 + after;
            after = 0;
            if(res.number[i] >= 10){
                after = 1;
                res.number[i] -= 10;
            }
            x--;
            y--;

        }
        return res;
    }
}