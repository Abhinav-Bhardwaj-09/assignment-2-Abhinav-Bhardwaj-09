package problem4.Node;

public class QueueNode {
    private int Element;
    private problem4.Node.QueueNode next;

    public QueueNode(int element) {
        Element = element;
        this.next = null;
    }

    public int getElement() {
        return Element;
    }

    public void setElement(int element) {
        Element = element;
    }

    public problem4.Node.QueueNode getNext() {
        return next;
    }

    public void setNext(problem4.Node.QueueNode next) {
        this.next = next;
    }
}