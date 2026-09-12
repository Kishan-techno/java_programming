import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a cp: ");
        int cp = sc.nextInt();
        System.out.print("Enter a sp: ");
        int sp = sc.nextInt();

        if(sp>cp) System.out.println("profit is" + (sp-cp));
        else if(sp==cp)System.out.println(" No profit no loss");
        else System.out.println("loss is" + (cp-sp) );
    }
}
