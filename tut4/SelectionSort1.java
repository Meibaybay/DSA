import java.util.Scanner;

public class SelectionSort1 {
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
        SelectionSort(array);
        System.out.println("Selection sort: ");
        printArray(array);
    }
    public static void SelectionSort(int[] arr) {
        for (int i = arr.length-1; i >= 0; i-- ) {
            int max = arr[i];
            int pos = i;
            for (int j = i-1; j>=0; j--){
                if (max < arr[j]) {
                    max = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = max;
        }
        }
    public static void printArray (int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println(" ");
    }

}
