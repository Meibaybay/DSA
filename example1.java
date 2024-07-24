import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double num2 = sc.nextDouble();

        double roundedNum1 = Math.round(num1 * 1000.0) / 1000.0;
        double roundedNum2 = Math.round(num2 * 1000.0) / 1000.0;
        System.out.println("The first rounded number:" + roundedNum1);
        System.out.println("The second rounded number:" + roundedNum2);

        if (roundedNum1 == roundedNum2) {
            System.out.println("The two numbers are the same after rounding to three decimal places.");
        } else {
            System.out.println("The two numbers are different after rounding to three decimal places.");
        }
    }
}

