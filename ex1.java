import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values in array: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of array in ascending order: ");
        int [] N = new int[n];
        for (int i = 0; i<n; i++) {
            N[i] = sc.nextInt();
        }
        System.out.println("Enter the integer to search for: ");
        int m = sc.nextInt();
        int result = SimpleSearch(n, N, m);
        if (result==-1){
            System.out.println(m + "doesn't appear in the array.");
        } else {
            System.out.println(m + " appears at index " + result + ".");
        }
    }
    //algorithm O(n)
    public static int SimpleSearch (int n, int [] N, int m) {
        for (int i = 0; i < n; i++) {
            if (N[i] == m) {
                return i;
            }
        }
        return -1;
    }
}
