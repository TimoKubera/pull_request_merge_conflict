public class ArrayProcessor {

    /**
     * Finds and returns the maximum value in an array of integers.
     *
     * @param array the array of integers to be processed
     * @return the maximum integer value in the array
     * @throws IllegalArgumentException if the input array is null or empty
     */
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Finds and returns the minimum value in an array of integers.
     *
     * @param array the array of integers to be processed
     * @return the minimum integer value in the array
     * @throws IllegalArgumentException if the input array is null or empty
     */
    public int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
