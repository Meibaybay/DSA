package LECTURE8;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String exp = "62+31-4*7+*";
        ArrayStack stack = new ArrayStack();
        System.out.println("postfix evaluation: " +  stack.ArrayStack(exp));
    }
}

