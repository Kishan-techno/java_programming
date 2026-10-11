public class UltaStarTringle {

    static class Solution {
        public void pattern8(int n) {

            for (int i = 1; i <= n; i++) {

                // Print spaces
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.pattern8(5);
    }
}