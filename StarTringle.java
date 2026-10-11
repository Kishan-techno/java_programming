class StarTringle {

    public void pattern7(int n) {
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarTringle obj = new StarTringle();
        obj.pattern7(5);
    }
}