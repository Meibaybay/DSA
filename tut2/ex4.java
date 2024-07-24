import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer m: ");
        int m = sc.nextInt();
        System.out.println("Enter the integer n: ");
        int n = sc.nextInt();
        int result = SimpleGCD(m,n);
        System.out.println("The value of gcd(m,n): " + result);
    }
    public static int SimpleGCD (int m, int n){
        int i = n;
        while (i>1) {
            if ((m%i==0) && (n%i==0)) {
                return i;
            }
            i--;
        }
        return 1;
    }
}
