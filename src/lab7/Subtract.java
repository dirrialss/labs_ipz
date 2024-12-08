package lab7;
import java.util.Map;
/**
 * NonTerminal Expression. Subtraction.
 * Represents a subtraction operation in an expression.
 * Implements the {@code Expression} interface.
 */
public class Subtract implements Expression {
    /**
     * The left operand of the subtraction operation.
     */
    private final Expression left;
    /**
     * The right operand of the subtraction operation.
     */
    private final Expression right;
    /**
     * Constructor to initialize the subtraction operation with two operands.
     * @param left  the left operand of the subtraction.
     * @param right the right operand of the subtraction.
     */
    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * Evaluates the subtraction operation by interpreting the left and right operands
     * in the given context and subtracting their results.
     * @param context a map containing variable names and their values.
     * @return the result of the subtraction operation.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
    /**
     * Returns the string representation of the subtraction operation.
     * @return a string in the format "(left - right)".
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
