package lab7;
import java.util.Map;
/**
 * NonTerminal Expression. Dividing.
 * Represents a division operation in an expression.
 * Implements the {@code Expression} interface.
 */
public class Divide implements Expression {
    /**
     * The left operand of the division operation.
     */
    private final Expression left;
    /**
     * The right operand of the division operation.
     */
    private final Expression right;
    /**
     * Constructor to initialize the division operation with two operands.
     * @param left  the left operand of the division.
     * @param right the right operand of the division.
     */
    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * Evaluates the division operation by interpreting the left and right operands
     * in the given context and dividing the result of the left operand by the right operand.
     * @param context a map containing variable names and their values.
     * @return the result of the division operation.
     * @throws ArithmeticException if the right operand evaluates to zero.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        int divisor = right.interpret(context);
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return left.interpret(context) / divisor;
    }
    /**
     * Returns the string representation of the division operation.
     * @return a string in the format "(left / right)".
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }
}
