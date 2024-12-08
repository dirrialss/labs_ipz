package lab6;
/**
 * Context class.
 * The SorterContext class manages sorting operations using a specified
 * {@link SortingStrategy}. It allows dynamically changing the sorting strategy
 * at runtime.
 */
public class SorterContext {
    /**
     * The current sorting strategy used by the context.
     */
    private SortingStrategy strategy;
    /**
     * Constructs a {@code SorterContext} with the given sorting strategy.
     */
    public SorterContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    /**
     * Updates the sorting strategy used by the context.
     */
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    /**
     * Sorts an array of integers using the current sorting strategy.
     */
    public void sortArray(int[] array) {
        strategy.sort(array);
    }
    /**
     * Sorts an array of strings using the current sorting strategy.
     */
    public void sortArray(String[] array) {
        strategy.sort(array);
    }
}
