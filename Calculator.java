import java.util.List;

public class Calculator {
    public int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
