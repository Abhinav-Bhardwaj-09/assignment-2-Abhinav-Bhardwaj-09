package problem5.node;
import problem5.student.Student;
// to define node properties
// to define node properties
public class Node {
    private Student data;
    private Node next;

    public Node(String Name, int Roll, int Number_of_Backlogs, int AppearingCount) {
        this.data = new Student(Name, Roll, Number_of_Backlogs, AppearingCount);
        this.next = null;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}