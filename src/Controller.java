import java.util.ArrayList;

public class Controller {
    private ArrayList<AriphmeticAction> actions;
    private Controller controller = new Controller();

    private Controller(){
        actions = new ArrayList<>();
        actions.add(new Addition());
        actions.add(new Subtraction());
        actions.add(new Multiplication());
        actions.add(new Division());
    }

    public LongNumber calculate(LongNumber num1, String action, LongNumber num2){
        if(action.equals("add")){
            return actions.get(0).action(num1, num2);
        }
        if(action.equals("minus")){
            return actions.get(1).action(num1, num2);
        }
        if(action.equals("multiply")){
            return actions.get(2).action(num1, num2);
        }
        if(action.equals("divide")){
            return actions.get(3).action(num1, num2);
        }

        return null;
    }

    private Controller getInstance(){
        return controller;
    }
}
