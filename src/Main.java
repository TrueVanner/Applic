public class Main {
    public static void main(String[] args){

        LongNumber num1 = new LongNumber("6");
        LongNumber num2 = new LongNumber("3");

        Controller controller = Controller.getInstance();

        System.out.println(controller.calculate(num1, "divide", num2));


    }

}
