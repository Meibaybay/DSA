class ArrayList {
    private int[] arr;
    private int size;
    private static final int default_capacity = 10;
    public ArrayList() {
        arr = new int [default_capacity];
        size = 0;
    }
    public void add (int element){
        if (size == arr.length) {
            resize();
        }
        arr[size++] = element;
    }
    private void resize(){
        int newSize = arr.length*2;
        int [] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }
    public void addAt(int pos, int data) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        if (size == arr.length) {
            resize();
        }
        for (int i = size; i > pos-1; i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1] = data;
        size++;

    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == arr.length;
    }
    public int size() {
        return size;
    }

    public void printNode (int pos) {
        if(pos<0||pos>=size){
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        System.out.println("Data at position " + pos + " is " + arr[pos-1]);
    }
    public void printList() {
        System.out.println("Element of the ArrayList: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

}
public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(17);
        list.add(4);
        list.add(20);
        list.add(27);
        list.add(17);
        list.addAt(3,1);
        list.printNode(2);
        list.printList();
        }
    }

