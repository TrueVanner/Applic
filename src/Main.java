public class Main {
    public static void main(String[] args){

        LongNumber num1 = new LongNumber("456");
        LongNumber num2 = new LongNumber("123");

        //в Division сейчас бесконечный цикл, не запускай

        //TODO: я хочу сделать как говорил Директор, через Enum. Начну все переносить только с твоего разрешения

        System.out.println(Addition.action(num1, num2).intoString());            // 579
        System.out.println(Subtraction.action(num1, num2).intoString());         // 333
        System.out.println(Multiplication.action(num1, num2).intoString());      // 56088
        System.out.println(Division.action(num1, num2).intoString());            // 3

    }

}
