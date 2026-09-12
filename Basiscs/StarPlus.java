import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r = sc.nextInt();
         System.out.print("Enter the coloum: ");
        int c = sc.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <= c; j++) {
                 if(i==(r/2)+1   ||  j==(c/2)+1)
                    System.out.print("* ");
                else System.out.print("  ");


            }
            
            System.out.println();
        }
    }
}
