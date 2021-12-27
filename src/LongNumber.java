public class LongNumber {
    public int[] number;
    public int digit;

    public LongNumber() {
        this.number = new int[1];
        this.number[0] = 0;
        this.digit = 1;
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

        for (int i = 0; i < num.digit; i++) {
            this.number[i] = num.number[i];
        }
    }

    @Override
    public String toString() {   //чтобы не было проблем с дефолтным toString
        removeZeros();
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < digit; i++) {
            res.append(number[i]);
        }
        return res.toString();
    }

    private void removeZeros() {
        int x;
        for (x = 0; number[x] == 0; x++) ;
        int[] buff = new int[digit - x];
        System.arraycopy(number, x, buff, 0, digit - x);
        number = new int[digit - x];
        System.arraycopy(buff, 0, number, 0, digit - x);
        digit = digit - x;
    }

    /**
     * Выполняет сразу две новых работы:
     * - позволяет изменять digit, при этом не очищая старый массив
     * - заполняет пустые места -1, чтобы они были видны и их можно было легко удалять
     * <p>
     * <p>
     * блять это не работает сука
     */

    public void setDigits(int digits) {
        number = new int[digits];
        this.digit = digits;
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
