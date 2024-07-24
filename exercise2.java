import java.util.Scanner;
public class exercise2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the values: ");
        for (int i =0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        int a = arr[0];
        for (int i= 0; i<arr.length;i++){
            if( arr[i]>a){
                a=arr[i];
            }

        }
        System.out.println("The max number is: " + a);
    }
}
