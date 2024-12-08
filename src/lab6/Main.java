package lab6;

import java.util.Arrays;
/**
 * Main class.
 * The {@code Main} class demonstrates the use of the Strategy design pattern for sorting arrays.
 * It showcases how the sorting strategy can be dynamically changed at runtime.
 * <p>The program shows the initial state of the arrays, sorts them in ascending order,
 * and then changes the sorting strategy to descending order to demonstrate how the strategy can be swapped dynamically.</p>
 * @author Siukalo Diana
 */
public class Main {
    /**
     * The main method demonstrates the use of the Strategy design pattern by
     * sorting integer and string arrays using different sorting strategies.
     */
    public static void main(String[] args) {
        int[] intArray = {15, 2, 8, 4, 1,11,3};
        String[] stringArray = {"dance", "boxing", "skating", "athletics"};
        System.out.println("Initial array (integers): " + Arrays.toString(intArray));
        System.out.println("Initial array (strings): " + Arrays.toString(stringArray));
        System.out.println("-----------------------------------" );
        SorterContext sorter = new SorterContext(new AscendingSort());
        System.out.println("Sorting in ascending order:");
        sorter.sortArray(intArray);
        System.out.println(Arrays.toString(intArray));
        sorter.sortArray(stringArray);
        System.out.println(Arrays.toString(stringArray));
        sorter.setStrategy(new DescendingSort());
        System.out.println("\nSorting in descending order:");
        sorter.sortArray(intArray);
        System.out.println(Arrays.toString(intArray));
        sorter.sortArray(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}
