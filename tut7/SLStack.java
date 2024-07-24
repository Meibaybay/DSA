package Exercise;

class SLNode {
    char data;
    SLNode next;

    public SLNode(char data) {
        this.data = data;
        this.next = null;
    }
}

class CharStack {
    private SLNode top;

    public CharStack() {
        this.top = null;
    }

    public void push(char item) {
        SLNode newNode = new SLNode(item);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return '\0';
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '\0';
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class SLStack {
    public static void main(String[] args) {
        CharStack stack = new CharStack();

        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}
