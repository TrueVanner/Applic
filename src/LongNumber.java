public class LongNumber {
    public int[] number;
    public int digit;

    public LongNumber() {
        this.number = new int[]{0};
        this.digit = 1;
    }   //на будущее

    public LongNumber(String number) {
        this.number = new int[number.length()];

        //TODO: РЕАЛИЗОВАТЬ ЗАПИСЬ В ДРУГУЮ СТОРОНУ!!

        for (int i = 0; i < number.length(); i++) {
            this.number[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        this.digit = this.number.length;
    }

    public LongNumber(LongNumber num) {
        this.digit = num.digit;
        this.number = new int[num.digit];

        for (int i = 0; i < num.digit; i++) {
            this.number[i] = num.number[i];
        }
    }

    public String intoString() {   //чтобы не было проблем с дефолтным toString
        String res = "";
        for (int i = 0; i < this.digit; i++) {
            if (i > 0)
                res += this.number[i];
            else {
                if (this.number[i] != 0) {
                    res += this.number[i];
                }
            }
        }
        return res;

        // я потом переделаю кражу нулей
    }

    public void setDigit(int digits) {
        this.number = new int[digits];
        this.digit = digits;
    }
}
