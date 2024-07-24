import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The degree of the polynomial: ");
        int n = sc.nextInt();
        double [] A = new double[n];
        System.out.println("The coefficients of the polynomial: ");
        for (int i =0; i<n; i++){
            A[i] = sc.nextDouble();
        }
        System.out.println("Enter the real value of x: ");
        double x = sc.nextDouble();
        double result = PolyEvaluate(n,A,x);
        System.out.println("The value of f(x) is " + result);
    }
    public static double PolyEvaluate (int n, double [] A, double x){
        int result = 0;
        for(int i = n-1; i>=0; i--){
            result*=x*=A[i];
        }
        return result;
    }

}
