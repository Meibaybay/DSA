import java.util.Arrays;
import java.util.Scanner;

public class exerccise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The sorted list is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

