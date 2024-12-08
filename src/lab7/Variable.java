package lab7;
import java.util.Map;
/**
 * Terminal Expression.
 * Represents a variable in an expression.
 * Implements the {@code Expression} interface.
 */
public class Variable implements Expression {
    /**
     * The name of the variable.
     */
    private final String name;
    /**
     * Constructor to initialize the variable with its name.
     * @param name the name of the variable.
     */
    public Variable(String name) {
        this.name = name;
    }
    /**
     * Returns the value of the variable from the provided context.
     * @param context a map containing variable names and their values.
     * @return the value of the variable from the context.
     * @throws IllegalArgumentException if the variable is not found in the context.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        if (context.containsKey(name)) {
            return context.get(name);
        } else {
            throw new IllegalArgumentException("Variable not found: " + name);
        }
    }
    /**
     * Returns the string representation of the variable.
     * @return the variable's name.
     */
    @Override
    public String toString() {
        return name;
    }
}
