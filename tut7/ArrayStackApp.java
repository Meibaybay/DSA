package Example;

public class ArrayStackApp {
    public static void main(String[] args) {
        ArrayStack stack1 = new ArrayStack();
        stack1.push("Hihi");
        stack1.push("Haha");
        stack1.push("mei");
        System.out.println("Stack 1:");
        printStack(stack1);
        ArrayStack stack2 = new ArrayStack();
        copyStack(stack1, stack2);
        System.out.println("Stack 2 (copied from Stack 1):");
        printStack(stack2);

    }

    public static void copyStack(ArrayStack src, ArrayStack des) {
        ArrayStack tmp = new ArrayStack();
        while (!src.isEmpty()) {
            tmp.push(src.pop());
        }
        while (!tmp.isEmpty()) {
            String item = tmp.pop();
            des.push(item);
            src.push(item);
        }
    }

    public static void printStack(ArrayStack s) {
        ArrayStack tempStack = new ArrayStack();
        System.out.print("[");
        while (!s.isEmpty()) {
            String item = s.pop();
            System.out.print(item);
            tempStack.push(item);
            if (!s.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }

    interface StackADT {
        void push(String item);
        String pop();
        String peek();
        boolean isEmpty();
        boolean isFull();
    }

    static class ArrayStack implements StackADT {
        private String[] array;
        private int maxSize = 100;
        private int top;

        public ArrayStack() {
            array = new String[maxSize];
            top = -1;
        }

        public int getTop() {
            return this.top;
        }

        public String[] getArray() {
            return this.array;
        }

        public boolean isEmpty() {
            if (top == -1) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isFull() {
            if (top == maxSize - 1) {
                return true;
            } else {
                return false;
            }
        }

        public void push(String item) {
            if (!isFull()) {
                top++;
                array[top] = item;
            }
        }

        public String pop() {
            if (!isEmpty()) {
                String tmp = array[top];
                top--;
                return tmp;
            } else {
                return null;
            }
        }

        public String peek() {
            if (!isEmpty()) {
                return array[top];
            } else {
                return null;
            }
        }

    }
}
