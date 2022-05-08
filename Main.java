import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is a simple calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The summation of the numbers is: " + sum);
    }
}
