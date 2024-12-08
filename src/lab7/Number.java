package lab7;
import java.util.Map;
/**
 * Terminal expression.
 * Represents a constant number in an expression.
 * Implements the {@code Expression} interface.
 */
public class Number implements Expression{
    /**
     * The numeric value of this expression.
     */
    private final int number;
    /**
     * Constructor to initialize a constant number.
     * @param number the numeric value of the expression.
     */
    public Number(int number) {
        this.number = number;
    }
    /**
     * Returns the constant value of the number.
     * @param context a map of variable values (not used here since it's a constant).
     * @return the constant number.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return number;
    }
    /**
     * Returns the string representation of the number.
     * @return the number as a string.
     */
    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
