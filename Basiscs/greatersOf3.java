import java.util.Scanner;

public class greatersOf3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter 1st number: ");  
    int a = sc.nextInt();  
     System.out.print(" Enter 2nd number: ");  
    int b = sc.nextInt();  
     System.out.print(" Enter 3rd number: ");  
    int c = sc.nextInt();
    if(a>b && a>c)System.out.println("The largest no is: " + a);  
    if(b>a && b>c)System.out.println("The largest no is: " + b);
    if(c>b && c>a)System.out.println("The largest no is: " + c);   
    sc.close(); 
    }
}
