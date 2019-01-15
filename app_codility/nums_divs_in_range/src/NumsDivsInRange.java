import java.util.Scanner;

public class NumsDivsInRange {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        System.out.println("Enter number to divide by:");
        int n = scan.nextInt();
        scan.close();
        System.out.println(b/n - a/n + (a % n == 0 ? 1 : 0));
    }

}
