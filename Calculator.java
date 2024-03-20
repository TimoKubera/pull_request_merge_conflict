import java.util.List;

/**
 * This class provides methods to perform arithmetic operations on numbers.
 */
public class Calculator {

    /**
     * Calculates the sum of a list of integers.
     *
     * @param numbers The list of integers to be summed up.
     * @return The sum of the integers in the list.
     */
    public int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}