import java.util.ArrayList;

public class ArithmeticController {
    private ArrayList<AriphmeticAction> actions;
    private static ArithmeticController controller = new ArithmeticController();

    private ArithmeticController(){
        actions = new ArrayList<>();
        actions.add(new Addition());
        actions.add(new Subtraction());
        actions.add(new Multiplication());
        actions.add(new Division());
    }

    public void addAction(AriphmeticAction action){
        actions.add(action);
    }

    public LongNumber calculate(LongNumber num1, String act, LongNumber num2){
        if(act.equals("divide")){
            return actions.get(3).action(num1, num2);
        }
        else if(act.equals("multiply")){
            return actions.get(2).action(num1, num2);
        }
        else if(act.equals("add")){
            return actions.get(0).action(num1, num2);
        }
        else if(act.equals("subtract")){
            return actions.get(1).action(num1, num2);
        }
        else if(act.equals("mod")){
            int x = findAction("Mod.class");
            return actions.get(x).action(num1, num2);
        }
        return null;
    }

    private int findAction(String className){
        for(int i = 0; i < actions.size(); i++){
            if(actions.get(i).getClass().toString().equals(className)){
                return i;
            }
        }
        return -1;
    }

    public static ArithmeticController getInstance(){
        return controller;
    }
}
