package problem3.node;

public class Node {
    private int Roll_No ;
    private String Name;
    private Node next ;


    public Node(int roll_No, String name) {
        Roll_No = roll_No;
        Name = name;
        next = null;
    }

    public int getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
