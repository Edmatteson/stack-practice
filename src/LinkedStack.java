import java.util.NoSuchElementException;

public class LinkedStack implements ICharStack {
    private class Node {
        public char c;
        public Node next;

        public Node(char c, Node next) {
            this.next = next; this.c = c;
        }
        public Node(char c) {
            this(c, null);
        }
    }
    // question: can code outside the LinkedStack class use the Node class?

    // private member to hold first node reference
    // constructor of zero args

    @Override
    public boolean isEmpty() {
        // code here
    }

    @Override
    public void push(char c) {
        // code here
    }

    @Override
    public char peek() throws NoSuchElementException {
        if(isEmpty())
            throw new NoSuchElementException();
        // else return the top char
    }

    @Override
    public char pop() throws NoSuchElementException {
        char ret = peek();
        // remove top node (pop it)
        return ret;
    }
    // question: why doesn't pop need to do any error checking?
    // (what would happen if you tried to pop an empty stack?)
}
