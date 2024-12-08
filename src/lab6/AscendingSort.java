package lab6;

import java.util.Arrays;
/**
 * Concrete Strategy class.
 * {@code AscendingSort} implements the {@link SortingStrategy} interface to provide
 * a sorting algorithm that sorts arrays in ascending order.
 * <p>This class sorts both integer and string arrays in ascending order.</p>
 */
public class AscendingSort implements SortingStrategy{
    /**
     * Sorts an integer array in ascending order.
     * @param array the integer array to be sorted
     */
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
    /**
     * Sorts a string array in alphabetical (ascending) order.
     * @param array the string array to be sorted
     */
    @Override
    public void sort(String[] array) {
        Arrays.sort(array);
    }
}
