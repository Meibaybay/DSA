import java.util.Scanner;

public class InsertionSort1 {
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
        InsertionSort(array);
        System.out.println("Selection sort: ");
        printArray(array);
    }
    public static void InsertionSort (int[]a){
        for (int j = 1; j<a.length; j++) {
            int key = a[j];
            int i = j-1;
            while (i>=0 && a[i]>key) {
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] =   key;
        }
    }
    public static void printArray (int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println(" ");
    }
}
