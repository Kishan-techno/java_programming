import java.util.*;

public class Win {

    public static void main(String[] args) {

        // Input
        int t = 3;

        int[][] input = {
            {10, 4},
            {20, 7},
            {15, 5}
        };

        for (int i = 0; i < t; i++) {

            int x = input[i][0];
            int y = input[i][1];

            int win = x - y;

            System.out.println(win);
        }
    }
}