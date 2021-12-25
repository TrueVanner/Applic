public class Subtraction implements AriphmeticAction{

    public static LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber("");
        int maxDigits = num1.digit > num2.digit?num1.digit: num2.digit;
        res.setDigit(maxDigits);
        int after = 0;
        int x = num1.digit-1;
        int y = num2.digit-1;

        int h = 0;
        if(num1.digit < num2.digit){
            h = -1;
        }
        else{
            h = 1;
            if(num1.digit == num2.digit){
                h = num1.number[0]<num2.number[0]?-1:1;
            }
        }


        for(int i = maxDigits-1; i >=0; i--){
            int buf1= x>=0?num1.number[x]*h:0, buf2 = (y)>=0?num2.number[y]*h:0;
            res.number[i] = buf1 - buf2 + after;
            if(res.number[i] < 0){
                res.number[i] += 10;
                after = -1;
            }
            x--;
            y--;
        }

        return res;
    }
}
