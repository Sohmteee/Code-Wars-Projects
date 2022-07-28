package SumOfDigits;

public class Main {
    public static int digital_root(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum > 9 ? digital_root(sum) : sum;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(12345));
    }
}
