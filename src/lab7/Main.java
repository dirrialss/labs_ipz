package lab7;
import java.util.Map;
/**
 * Main class.
 * Main class to demonstrate the usage of the InterpreterRPN class to evaluate
 * Reverse Polish Notation (RPN) expressions.
 * @author Siukalo Diana
 */
public class Main {
    /**
     * The main method to execute the RPN expression evaluation.
     */
    public static void main(String[] args) {
        String expression = "6 x 4 1 - * + 2 * 1 y + /";
        InterpreterRPN interpreter = new InterpreterRPN(expression);
        Map<String, Integer> context = Map.of("x", 3, "y",4);
        System.out.println("Reverse Polish Notation \nexpression: " + expression + "\n------------");
        int result = interpreter.evaluate(context);
        System.out.println("Traditional notation \nexpression: " + interpreter.getExpression() + "\n------------");
        System.out.println("Result = " + result);
    }
}
