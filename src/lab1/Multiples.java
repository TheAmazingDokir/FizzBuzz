package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(10, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int counter = 0;

        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i=1; i <= n / a; i++) {
            if (i * a < n) {
                counter += 1;
            }

            int numberTimesB = i * b;
            if (numberTimesB % a != 0 && numberTimesB < n) {
                counter += 1;
            }
        }
        return counter;
    }
}
