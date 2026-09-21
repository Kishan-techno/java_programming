public class taller {
    public static void main(String[] args) {

        int t = 3;

        int[][] input = {
            {10, 20},
            {30, 20},
            {15, 15}
        };

        for (int i = 0; i < t; i++) {

            int x = input[i][0];
            int y = input[i][1];

            if (x < y) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }
}