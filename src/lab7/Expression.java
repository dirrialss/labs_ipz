package lab7;
import java.util.Map;
/**
 * Abstract expression.
 * Represents an abstract expression in the Interpreter design pattern.
 * Each implementation of this interface defines how a specific type of expression
 * is evaluated in a given context.
 */
public interface Expression {
    /**
     * Evaluates the expression based on the provided context.
     * @param context a map of variable names and their corresponding integer values.
     * @return the result of evaluating the expression.
     */
    int interpret(Map<String, Integer> context);
    /**
     * Returns the string representation of the expression in  traditional infix notation.
     * @return the infix notation of the expression as a string.
     */
    String toString();
}
