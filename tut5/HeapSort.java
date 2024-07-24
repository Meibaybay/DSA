import java.util.Scanner;
public class HeapSort {
    public static void print_array(int [] a) {
        for (int i=0; i<a.length; i++) {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }
    public static int LeftChild(int i)
    {
        return 2*i+1;
    }
    public static int RightChild(int i)
    {
        return 2*i+2;
    }
    public static void TrickleDown(int[] a, int n, int i) {
        int l=LeftChild(i);
        int r=RightChild(i);
        int maxpos=i;
        if ((l<n)&&(a[l]>a[maxpos]))
            maxpos=l;
        if ((r<n)&&(a[r]>a[maxpos]))
            maxpos=r;
        if (maxpos != i) {
            int tmp=a[i];
            a[i]=a[maxpos];
            a[maxpos]=tmp;
            TrickleDown(a,n,maxpos);
        }
    }
    public static void BuildHeap(int[] a, int n) {
        for (int i=n/2-1; i>=0; i--) {
            TrickleDown(a, n, i);
        }
    }
    public static void Heap_Sort(int[] a) {
        int n=a.length;
        BuildHeap(a,n);
        System.out.println("Array a now becomes a max heap:");       
        print_array(a);
        for (int i=n-1; i>0; i--) {
            int tmp=a[0];
            a[0]=a[i];
            a[i]=tmp;
            n=n-1;
            TrickleDown(a,n,0);
            System.out.println("Array a now becomes a max heap:");
            print_array(a);  
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
            System.out.println("Please input the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }        
        System.out.println("The list of integers is: ");
        print_array(a);
        Heap_Sort(a);
        System.out.println("The list of sorted integers is: ");
        print_array(a);
    }    
}
