import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is a simple calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first_number = sc.nextInt();
        System.out.println("Enter the second number");
        int second_number = sc.nextInt();

        int sum_result = first_number+second_number;
        System.out.println("The summation of the numbers is: " + sum_result);
    }
}
