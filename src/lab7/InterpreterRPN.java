package lab7;
import java.util.Map;
import java.util.Stack;
/**
 * Context.
 * Interpreter for evaluating expressions written in Reverse Polish Notation (RPN).
 * Implements the Interpreter pattern to evaluate mathematical expressions.
 * This class converts an RPN expression into a syntax tree and evaluates it based on a given context.
 */
public class InterpreterRPN {
    /**
     * The syntax tree representing the expression parsed from the input.
     */
    private final Expression syntaxTree;
    /**
     * Constructor that initializes the interpreter with a given expression in RPN format.
     * It parses the expression and builds the corresponding syntax tree.
     * @param expression the expression in Reverse Polish Notation (RPN).
     */
    public InterpreterRPN(String expression) {
        Stack<Expression> expressionStack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                expressionStack.push(new Number(Integer.parseInt(token)));
            } else if (token.matches("[a-zA-Z]+")) {
                expressionStack.push(new Variable(token));
            } else {
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();
                Expression operator = createExpression(token, left, right);
                expressionStack.push(operator);
            }
        }
        syntaxTree = expressionStack.pop();
    }
    /**
     * Creates the appropriate operator expression (Add, Subtract, Multiply, or Divide)
     * based on the operator string.
     * @param operator the operator symbol (e.g., "+", "-", "*", "/").
     * @param left the left operand.
     * @param right the right operand.
     * @return the corresponding expression representing the operation.
     * @throws IllegalArgumentException if the operator is unknown.
     */
    private Expression createExpression(String operator, Expression left, Expression right) {
        return switch (operator) {
            case "+" -> new Add(left, right);
            case "-" -> new Subtract(left, right);
            case "*" -> new Multiply(left, right);
            case "/" -> new Divide(left, right);
            default -> throw new IllegalArgumentException("Unknown operator: " + operator + ". Error!");
        };
    }
    /**
     * Evaluates the expression represented by the syntax tree with the given context.
     * @param context a map containing the variable names and their values.
     * @return the result of evaluating the expression.
     */
    public int evaluate(Map<String, Integer> context) {
        return syntaxTree.interpret(context);
    }
    /**
     * Returns the string representation of the expression in infix notation.
     * @return the string representation of the expression.
     */
    public String getExpression() {
        return syntaxTree.toString();
    }
}
