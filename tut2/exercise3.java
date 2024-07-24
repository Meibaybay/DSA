import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real number x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the integer n: ");
        double n = sc.nextDouble();
        double result = SimplePow(x, n);
        System.out.println("The value of x^n: " + result);
    }
    public static double SimplePow(double x, double n){
        double s = Math.pow(x,n);
        return s;
    }
}
