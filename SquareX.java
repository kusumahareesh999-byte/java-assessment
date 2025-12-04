public class SquareX {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                // Border or diagonals
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // TWO SPACES to keep square shape
                }
            }

            System.out.println();
        }
    }
}
