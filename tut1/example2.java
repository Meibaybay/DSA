import java.util.Scanner;
import java.util.Random;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random a = new Random();

        System.out.print("Enter an integer N: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = a.nextInt();
        }

        System.out.println("List of random integers:");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}

