public class chandru {
    public static void main(String[] args) {
        System.out.println("Welcome to the complex program!");

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);

        String reversed = reverseString("chandru");
        System.out.println("Reversed string: " + reversed);

        boolean isPrime = checkPrime(29);
        System.out.println("Is 29 a prime number? " + isPrime);
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
