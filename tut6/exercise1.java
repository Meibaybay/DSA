class ArrayList1 {
    private int[] arr;
    private int size;
    private static final int default_capacity = 10;
    public ArrayList1() {
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
        for (int i = size; i > pos; i--){
            arr[i]=arr[i-1];
        }
        arr[pos] = data;
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
        System.out.println("Data at position " + pos + " is " + arr[pos]);
    }
    public void printList() {
        System.out.println("Element of the ArrayList: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    public void remove (int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        for (int i = pos; i<size; i++) {
            arr[i-1] = arr [i];
        }
        size--;
    }

}
public class exercise1 {
    public static void main(String[] args) {
        ArrayList1 list = new ArrayList1();
        list.add(17);
        list.add(4);
        list.add(20);
        list.add(27);
        list.add(17);
        list.addAt(3,1);
        list.printNode(2);
        list.printList();
        list.remove(3);
    }
}

