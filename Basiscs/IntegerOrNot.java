import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        double n = sc.nextDouble();
     int x = (int)n;
     if(n-x > 0) System.out.println("Not an integer");
        else System.out.println("IS an integer"); 
    }
}
