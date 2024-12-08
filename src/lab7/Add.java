package lab7;
import java.util.Map;
/**
 * NonTerminal Expression. Adding.
 * Represents an addition operation in an expression.
 * Implements the {@code Expression} interface.
 */
public class Add implements  Expression {
    /**
     * The left operand of the addition operation.
     */
    private final Expression left;
    /**
     * The right operand of the addition operation.
     */
    private final Expression right;
    /**
     * Constructor to initialize the addition operation with two operands.
     * @param left  the left operand of the addition.
     * @param right the right operand of the addition.
     */
    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * Evaluates the addition operation by interpreting the left and right operands
     * in the given context and summing their results.
     * @param context a map containing variable names and their values.
     * @return the result of the addition operation.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
    /**
     * Returns the string representation of the addition operation.
     * @return a string in the format "(left + right)".
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
