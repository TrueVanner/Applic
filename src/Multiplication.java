public class Multiplication implements AriphmeticAction {

    public LongNumber action(LongNumber num1, LongNumber num2) {
        LongNumber res = new LongNumber("0");
        res.resetDigits(num1.digit*num2.digit);
        int after=0;
        Addition add = new Addition();
        LongNumber buff = new LongNumber("0");

       for(int i = num2.digit-1; i > -1; i--){
           buff.resetDigits(num1.digit+1);

           for(int j = num1.digit-1; j > -1; j--){
               buff.number[j+1] = num1.number[j]*num2.number[i] + after;
               for(after = 0; buff.number[j+1] >= 10; after++, buff.number[j+1]-=10);
           }
           buff.number[0] = after;

           buff.addDigits(num2.digit-1-i);

           res = new LongNumber(add.action(res, buff));
       }

        return res;
    }


}