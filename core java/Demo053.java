import java.util.Scanner;
public class Demo053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
        
        sc.close();
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

