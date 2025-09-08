package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int counter = 0;

        while(counter < 100) {

            counter = doFizzBuzz(counter);
        }
    }

    private static int doFizzBuzz(int counter) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = counter % 3 == 0;
        boolean divisibleBy5 = counter % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(counter);

        }

        counter += 1;
        return counter;
    }
}
