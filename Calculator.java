import java.util.List;

/**
 * The `Calculator` class provides methods to perform basic arithmetic operations.
 */
public class Calculator {

    /**
     * Calculates the sum of a list of integers.
     *
     * This method uses Java Streams to process the list and calculate the sum of its elements.
     *
     * @param numbers The list of integers to be summed up.
     * @return The sum of all integers in the list.
     */
    public int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
