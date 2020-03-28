package problem5.circularqueue;
import problem5.node.Node;
//to implement circular queue


public class MyCircularQueue {
    Node front = null;
    Node rear = null;

    public void insert(String Name, int Roll, int Backlogs, int AppearingCount) {
        Node newnode = new Node(Name, Roll, Backlogs, AppearingCount);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.setNext(newnode);
            newnode.setNext(front);
            rear = newnode;
        }
    }

    public void filtering() {
        Node current = front;
        while (current.getNext() != front) {
            if (current.getNext().getData().getNo_of_Backlogs() == 0 && current.getNext() == rear) {
                current.setNext(front);
                rear = current;
            }
            else if (current.getNext().getData().getNo_of_Backlogs() == 0) {
                current.setNext(current.getNext().getNext());
            }
            else {
                current = current.getNext();
            }
        }
        if (front.getData().getNo_of_Backlogs() == 0 && front == rear) {
            front = rear = null;
        }
        else if (front.getData().getNo_of_Backlogs() == 0) {
            front = front.getNext();
            rear.setNext(front);
        }
    }

    public void processingByUsingIteration() {
        Node current = front;
        if (front == null) {
            System.out.println("Sorry, but nothing to display since, Queue is Empty...");
        } else {
            while (current != rear) {
                current.getData().setNo_of_Backlogs(current.getData().getNo_of_Backlogs() - current.getData().getAppearingCount());
                current = current.getNext();
            }
            rear.getData().setNo_of_Backlogs(rear.getData().getNo_of_Backlogs() - rear.getData().getAppearingCount());
        }

    }

    public void display() {
        Node current = front;
        if (front == null) {
            System.out.println("the queue is empty");
            return;
        }
        else {
            while (current != rear) {
                System.out.print("Name      is    : " + current.getData().getName() );
                System.out.print("Rollnumber is   : " + current.getData().getRoll() );
                System.out.print("No. of Backlogs : " + current.getData().getNo_of_Backlogs() );
                System.out.print("Appearing Count : " + current.getData().getAppearingCount() );
                System.out.println();
                System.out.println();
                current = current.getNext();
            }
            System.out.print("Name     is     : " + rear.getData().getName() );
            System.out.print("Roll No.  is    : " + rear.getData().getRoll() );
            System.out.print("No. of Backlogs : " + rear.getData().getNo_of_Backlogs() );
            System.out.print("Appearing count : " + rear.getData().getAppearingCount() );
            System.out.println("-------------------**************--------------");
        }
    }
}