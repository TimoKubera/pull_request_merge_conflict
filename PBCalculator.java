public class PBCalculator {

    /**
     * Adds two integers.
     *
     * @param a The first integer to add.
     * @param b The second integer to add.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a The integer to be subtracted from.
     * @param b The integer to subtract.
     * @return The difference of a and b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a The first integer to multiply.
     * @param b The second integer to multiply.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of a and b.
     * @throws ArithmeticException if b is zero.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }
}
