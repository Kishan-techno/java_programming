
public class Solution {

    public void pattern9(int n) {

        // Upper pyramid
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower pyramid
        for (int i = 2; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.pattern9(5);
    }
}
