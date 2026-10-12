
import java.util.Scanner;

public class ScoreConsistent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int A = sc.nextInt();
            int B = sc.nextInt();

            int C = sc.nextInt();
            int D = sc.nextInt();

            if (C >= A && D >= B) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }

        sc.close();
    }
}
