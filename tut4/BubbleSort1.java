import java.util.Scanner;

public class BubbleSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of values: ");
        int n = sc.nextInt();
        System.out.println("Please enter values: ");
        int [] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(array);
        BubbleSort(array);
        System.out.println("Selection sort: ");
        printArray(array);
    }
    public static void BubbleSort (int[]a) {
        for (int i = 0; i < a.length-1; i++){
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j]>a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
    public static void printArray (int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println(" ");
    }
}
