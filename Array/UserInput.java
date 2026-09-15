
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] kishan = new int[7];
        // default values
        // for (int i = 1;i< 7; i++) {
        // System.out.print(kishan[i]+" ");

        // }
        for (int i = 0; i < 7; i++) {
            int x = sc.nextInt();
            kishan[i] = x;
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(kishan[i] + " ");
        }
        sc.close();
    }
}
