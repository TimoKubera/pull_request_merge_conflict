import java.util.List;

public class Calculator {
    public int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i); j++) {
                sum++;
            }
        }
        return sum;
    }
}