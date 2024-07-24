import java.util.Scanner;
public class QuickSort {
    public static void print_array(int [] a) {
        for (int i=0; i<a.length; i++) {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }
    private static int partition(int[] data, int idLeftMost, int idRightMost) {
            int down, up, pivot, temp;
            pivot = data[idLeftMost];
            up = idRightMost;
            down = idLeftMost;
            while (down < up) {
                while (data[down] <= pivot)
                            down++; 
                while (data[up] > pivot)
                            up--;
                if (down < up) {
                    temp = data[down];   
                    data[down] = data[up];   
                    data[up] = temp;
                }
            }
        data[idLeftMost] = data[up];
        data[up] = pivot;
        print_array(data);
        return up;
    }
    public static void Quick_Sort(int[] data, int idLeftmost, int idRightmost) {
            int j;
            if (idLeftmost < idRightmost) {
                j=partition(data, idLeftmost, idRightmost);
                Quick_Sort(data, idLeftmost, j-1);
                Quick_Sort(data, j+1, idRightmost);
            }
    }
    public static void main(String[]args) {
        int n;
        int [] a; 
        System.out.println("Please input the integer N:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        
        a=new int[n];
        for (int i=0; i<n; i++) {
            a[i]=scanner.nextInt();
        }        
        System.out.println("The list of integers is: ");
        print_array(a);
        Quick_Sort(a,0,n-1);
        System.out.println("The list of sorted integers is: ");
        print_array(a);
    }    
}
