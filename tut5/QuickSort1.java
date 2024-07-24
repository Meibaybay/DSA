import java.util.Scanner;

public class QuickSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập số lượng giá trị của dãy
        System.out.println("Please enter the number of value: ");
        int n = sc.nextInt();
        //nhập các giá trị trong dãy
        System.out.println("Please enter values: ");
        int[] array = new int[n];
        // dùng vòng for để đọc các giá trị của dãy
        for (int i = 0; i< array.length; i++) {
            array[i] = sc.nextInt();
        }
        //in dãy
        System.out.println("Array: ");
        printarray(array);
        //dùng method Quick Sort để sắp xếp lại dãy
        QuickSort(array, 0, n-1);
        //in lại dãy
        System.out.println("QuickSort: ");
        printarray(array);
    }
    //tạo method Partition để sắp xếp các phần tử trong các tập con
    private static int Partition (int[] array, int left, int right) {
        int down = left;
        int up = right;
        int pivot = array[left];
        while (down < up) {
            while (array[down] <= pivot) { //down < pivot thì pass qua phần tử tiếp theo (từ trái sang phải)
                down++;
            }
            while (array[up] > pivot){ //up > pivot thì pas qua phần tử tiếp theo (từ phải sang trái)
                up--;
            }
                int tmp = array[down]; //tạo biến mới tmp để lưu down
                array[down] = array[up]; //đổi chỗ down và up
                array[up] = tmp;//khi đó up = tmp

        }
        array[left] = array[up]; //hoán đổi vị trí của up và left để đổi chỗ với pivot
        array[up] = pivot; //đổi chỗ up với pivot
        return pivot; //trả về up (số nhỏ nhất)
    }
    //tạo method Quicksort để phân chia mảng lớn thành các mảng nhỏ
    public static void QuickSort(int[] array, int left, int right) {
        if (left < right) {
            int pos = Partition(array, left, right);
            QuickSort(array, left, pos-1);
            QuickSort(array, pos + 1, right);
        }
    }
    //tạo method để in ra dãy
    public static void printarray (int[] array) {
        for (int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
