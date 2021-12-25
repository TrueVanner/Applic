public class LongNumber {
    public int[] number;
    public int digit;

    //!!!!!!
    public LongNumber(LongNumber num) {
        this.number = num.number;
    }

    public LongNumber(String number) {
        this.number = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            this.number[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        this.digit = this.number.length;
    }

    public String toString() {
        String res = "";
        for(int i = 0; i < digit; i++) {
            if(i > 0)
                res += number[i];
            else{
                if(number[i] != 0){
                    res += number[i];
                }
            }
        }
        return res;
    }

    public void setDigit(int digits){
        number = new int[digits];
        digit = digits;
    }



}
