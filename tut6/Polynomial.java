class Term {
    double coefficient;
    int exponent;

    public Term(double coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }
}

class Node {
    Term term;
    Node next;

    public Node(Term term) {
        this.term = term;
        this.next = null;
    }
}

class Polynomial {
    private Node head;

    public Polynomial() {
        head = null;
    }

    public void addTerm(Term term) {
        Node newNode = new Node(term);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printPolynomial() {
        Node current = head;
        while (current != null) {
            System.out.print(current.term.coefficient + "x^" + current.term.exponent);
            if (current.next != null) {
                System.out.print(" + ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

public class Polynomial {
    public static void main(String[] args) {
        Polynomial polynomial = new Polynomial();
        polynomial.addTerm(new Term(3.2, 4));
        polynomial.addTerm(new Term(7, 2));
        polynomial.addTerm(new Term(-4, 1));
        polynomial.addTerm(new Term(2, 0));

        polynomial.printPolynomial();
    }
}
