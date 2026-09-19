import java.util.*;

public class Score {

    public static void main(String[] args) {

        // Input
        int t = 3;

        int[][] input = {
            {10, 20},
            {50, 30},
            {25, 25}
        };

        for (int i = 0; i < t; i++) {

            int x = input[i][0];
            int y = input[i][1];

            if (x >= y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }
}