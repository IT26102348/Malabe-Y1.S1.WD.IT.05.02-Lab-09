public class IT26102348Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public static int square(int a) {
        return multiply(a, a);
    }

    public static void main(String[] args) {
        // Calculation for expression i: (3 * 4 + 5 * 7)^2
        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int sumOfProducts = add(part1, part2);
        int result1 = square(sumOfProducts);

        // Calculation for expression ii: (4 + 7)^2 + (8 + 3)^2
        int squareSum1 = square(add(4, 7));
        int squareSum2 = square(add(8, 3));
        int result2 = add(squareSum1, squareSum2);

        // Displaying the results
        System.out.println(+ result1);
        System.out.println(+ result2);
    }
}