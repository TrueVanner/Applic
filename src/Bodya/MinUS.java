package Bodya;

public class MinUS implements AriphmeticAction {
    public static LongNumber action(LongNumber num1, LongNumber num2) {

        // Digits of first number must ALWAYS be higher than second, otherwise error
        if (num1.digit < num2.digit) {
            System.out.println("Digits of first number is smaller than second. Error!");
        }

        // Result of subtract
        int[] resultNumbers = new int[num1.digit];

        // Basic subtraction of two numbers starting from last to first
        // This part of code DOES NOT include subtracting smaller number from higher
        // This part of code DOES NOT include subtracting numbers with different digits
        if(num1.digit == num2.digit){
            for(int i=0; i<num1.digit; i++){
                resultNumbers[num1.digit-i] = num1.number[num1.digit-i]-num2.number[num2.digit-i];
            }
        }

        // Basic subtraction of two numbers starting from last to first
        // This part of code DOES NOT include subtracting smaller number from higher
        // This part of code DOES include subtracting numbers with different digits
        if(num1.digit > num2.digit){
            for(int i=0; i<num1.digit; i++){
                resultNumbers[num1.digit-i] = num1.number[num1.digit-i]-num2.number[num2.digit-i];
            }

            resultNumbers[num1.digit] = num1.number[num1.digit];
        }

        // Basic subtraction of two numbers starting from last to first
        // This part of code DOES include subtracting smaller number from higher
        // This part of code DOES NOT include subtracting numbers with different digits
        if(num1.digit == num2.digit){
            for(int i=0; i<num1.digit; i++){
                if(num1.number[num1.digit-i] < num2.number[num2.digit-i]){
                    num1.number[num1.digit-i]+=10;
                    num1.number[num2.digit-i-1]--;
                    if(num1.number[num1.digit-i-1] < 0){
                        num1.number[num1.digit-i-2]--;
                        num1.number[num1.digit-i-1]+=10;
                    }

                    resultNumbers[num1.digit-i] = num1.number[num1.digit-i] - num2.number[num2.digit-i];
                }
                else{
                    resultNumbers[num1.digit-i] = num1.number[num1.digit-i] - num2.number[num2.digit-i];
                }
            }
        }

        // Basic subtraction of two numbers starting from last to first
        // This part of code DOES include subtracting smaller number from higher
        // This part of code DOES include subtracting numbers with different digits
        if(num1.digit > num2.digit){
            for(int i=0; i<num1.digit; i++){
                if(num1.number[num1.digit-i] < num2.number[num2.digit-i]){
                    num1.number[num1.digit-i]+=10;
                    num1.number[num2.digit-i-1]--;
                    if(num1.number[num1.digit-i-1] < 0){
                        num1.number[num1.digit-i-2]--;
                        num1.number[num1.digit-i-1]+=10;
                    }

                    resultNumbers[num1.digit-i] = num1.number[num1.digit-i] - num2.number[num2.digit-i];
                }
                else{
                    resultNumbers[num1.digit-i] = num1.number[num1.digit-i] - num2.number[num2.digit-i];
                }
            }

            resultNumbers[num1.digit] = num1.number[num1.digit];
        }

    // Convert the result to String, so it can be return with LongNumber
    // If first symbol is '0', then it is just ignored. Result must not contain this zero, so it is deleted
    String result = "";

    for(int i=0; i<num1.digit; i++){
        if(resultNumbers[i] !=0)
            result+=resultNumbers[i];
    }

        return new LongNumber(result);
    }
}