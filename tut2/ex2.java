import java.util.Scanner;

public class ex2 {
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
    public static double PolyEvaluate (int n, double []A, double x){
        int s = 0;
        for (int i=0; i<n; i++){
            int p = 1;
            if (i != 0){
                for (int k =1; k<=i; k++){
                    p*=x;
                }
            }
            s+=A[i]*p;
        }
        return s;
    }
}
