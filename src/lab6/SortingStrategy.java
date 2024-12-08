package lab6;
/**
 * Strategy interface.
 * The SortingStrategy interface defines methods for sorting arrays
 * of integers and strings. It allows for implementing different sorting algorithms
 * that can be easily swapped using the Strategy design pattern.
 */
public interface SortingStrategy {
    /**
     * Sorts an array of integers.
     */
    void sort(int[] array);
    /**
     * Sorts an array of strings.
     */
    void sort(String[] array);
}
