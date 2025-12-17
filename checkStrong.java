import java.util.Scanner;

class StrongNumber {

    static void checkStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        String result = (sum == original) 
                        ? original + " is a strong number"
                        : original + " is not a strong number";

        System.out.println(result);
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkStrong(n);   // call parameterized method

        sc.close();
    }
}
