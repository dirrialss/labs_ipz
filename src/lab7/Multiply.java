package lab7;
import java.util.Map;
/**
 * NonTerminal Expression. Multiplication.
 * Represents a multiplication operation in an expression.
 * Implements the {@code Expression} interface.
 */
public class Multiply implements Expression {
    /**
     * The left operand of the multiplication operation.
     */
    private final Expression left;
    /**
     * The right operand of the multiplication operation.
     */
    private final Expression right;
    /**
     * Constructor to initialize the multiplication operation with two operands.
     *
     * @param left  the left operand of the multiplication.
     * @param right the right operand of the multiplication.
     */
    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * Evaluates the multiplication operation by interpreting the left and right operands
     * in the given context and multiplying their results.
     * @param context a map containing variable names and their values.
     * @return the result of the multiplication operation.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) * right.interpret(context);
    }
    /**
     * Returns the string representation of the multiplication operation.
     * @return a string in the format "(left * right)".
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }
}
