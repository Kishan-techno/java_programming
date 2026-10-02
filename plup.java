import java.util.*;

public class plup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            int sum = n * 10;

            System.out.println(sum);
        }

        sc.close();
    }
}

