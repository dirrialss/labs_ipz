package lab6;

import java.util.Arrays;
/**
 * Concrete Strategy class.
 * DescendingSort implements the {@link SortingStrategy} interface to provide
 * a sorting algorithm that sorts arrays in descending order.
 * <p>It first sorts the array in ascending order and then reverses the array to achieve descending order.</p>
 */
public class DescendingSort implements SortingStrategy {
    /**
     * Sorts an integer array in descending order.
     * @param array the integer array to be sorted
     */
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
        reverse(array);
    }
    /**
     * Sorts a string array in descending order.
     * @param array the string array to be sorted
     */
    @Override
    public void sort(String[] array) {
        Arrays.sort(array);
        reverse(array);
    }
    /**
     * Reverses the order of elements in an integer array.
     * @param array the integer array to be reversed
     */
    private void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    /**
     * Reverses the order of elements in a string array.
     * @param array the string array to be reversed
     */
    private void reverse(String[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
