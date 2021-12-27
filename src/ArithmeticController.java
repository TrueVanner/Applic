import java.util.ArrayList;

public class ArithmeticController {
    private ArrayList<AriphmeticAction> actions;
    private static ArithmeticController controller = new ArithmeticController();

    private ArithmeticController(){
        actions = new ArrayList<>();
    }

    public void addAction(AriphmeticAction action){
        actions.add(action);
    }

    /*public LongNumber calculate(LongNumber num1, String act, LongNumber num2){
        if(act.equals("divide")){

        }
    }*/

    public static ArithmeticController getInstance(){
        return controller;
    }
}
