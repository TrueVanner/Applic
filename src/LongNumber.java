public class LongNumber {
    public int[] number;
    public int digit;

    public LongNumber() {
        number = new int[1];
        number[0] = 0;
        digit = 1;
    }

    public LongNumber(String number) {
        this.number = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            this.number[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        this.digit = this.number.length;
    }

    public LongNumber(LongNumber num) {
        this.digit = num.digit;
        this.number = new int[num.digit];

        System.arraycopy(num.number, 0, this.number, 0, num.digit);
    }

    public LongNumber(int[] arr) {
        digit = arr.length;
        number = new int[digit];
        System.arraycopy(number, 0, arr, 0, digit);
    }

    @Override
    public String toString() {   //чтобы не было проблем с дефолтным toString
        if (digit == 1 && number[0] == 0) {
            return "0";
        }

        removeZeros();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < digit; i++) {
            res.append(number[i]);
        }
        return res.toString();
    }

    public void removeZeros() {
        int x;
        for (x = 0; x < digit && number[x] == 0 ; x++) ;
        int[] buff = new int[digit - x];
        System.arraycopy(number, x, buff, 0, digit - x);
        number = new int[digit - x];
        System.arraycopy(buff, 0, number, 0, digit - x);
        digit = digit - x;
    }

    public void resetDigits(int digits) {
        number = new int[digits];
        digit = digits;
        for(int i = 0 ;i < digit; i++){
            number[i] = 0;
        }
    }

    public void addDigits(int digits){
        if(digits > 0) {
            int[] buff = new int[digit + digits];
            System.arraycopy(number, 0, buff, 0, digit);
            for (int i = digit; i < digit + digits; i++) {
                buff[i] = 0;
            }
            number = new int[digit + digits];
            digit += digits;
            System.arraycopy(buff, 0, number, 0, digit);
        }
    }

    /**
     * Если больше указанного числа, возвращает 1
     * Если меньше указанного числа, возвращает -1
     * Если числа равны, возвращает 0
     */
    public int compareTo(LongNumber number) {
        if (digit > number.digit) {
            return 1;
        } else if (number.digit > digit) {
            return -1;
        } else {
            for (int i = 0; i < digit; i++) {
                if (this.number[i] > number.number[i]) {
                    return 1;
                } else if (number.number[i] > this.number[i]) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
