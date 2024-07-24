import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real number x: ");
        int x = sc.nextInt();
        System.out.println("Enter the integer n: ");
        int n = sc.nextInt();
        int result = SimplePow(x, n);
        System.out.println("The value of x^n: " + result);


    }
    public static int SimplePow (int x, int n){
        int s=1;
        if (n==0) {
            return s;
        }
        for (int i =0; i<n; i++){
            s*=x;
        }
        return s;
    }
}
