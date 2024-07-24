import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int [] A = new int[n];
        for (int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }
        Bubble_Sort(A);
        System.out.println("Rearrange Array: ");
        for (int e:A) {
            System.out.println(e + " ");
        }
    }

    public static void Bubble_Sort(int [] a)
    {

        Boolean isSorted = false;
        while (!isSorted)
        {
            isSorted=true;
            for (int i=0; i<a.length-1; i++)
                if (a[i]>a[i+1])
                {
                    int tmp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;
                    isSorted=false;
                }
        }
    }

}
