import java.util.Scanner;

public class MergeSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        System.out.println("Enter the values: ");
        int[] array = new int[n];
        for (int i =0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(array);
        MergeSort(array, 0, n-1);
        System.out.println("Merge Sort: ");
        printArray(array);
    }
    public static void MergeSort (int[] a, int left, int right){
        if (left<right) {
            int mid = (left + right )/2;
            MergeSort(a, left, mid);
            MergeSort(a, mid+1, right);
            Merge(a, left, mid, right);
        }
    }
    public static void Merge (int[] a, int left, int mid, int right) {
        int[] c = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while ((i <= mid) && (j<= right)) {
            if (a[i] < a[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = a[j];
                j++;
            }
            k++;
        }
            for (int t = i; t <= mid; t++) {
                c[k] = a[t];
                k++;
            }
            for (int t = j; t <= right; t++) {
                c[k] = a [t];
                k++;
            }
            for (int t = 0; t < k; t++){
                a[left+t] = c[t];
            }

    }
    public static void printArray (int[]a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }
}
