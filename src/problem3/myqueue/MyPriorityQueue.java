package problem3.myqueue;
import problem3.node.*;

public class MyPriorityQueue {
    Node front ;
    Node rear ;

    public MyPriorityQueue() {
        front = null;
        rear = null;
    }

    public void enqueue ( Node newnode ){
        if ( front == null || newnode.getRoll_No() < front.getRoll_No() ){
            if ( front == null ){
                rear = newnode;
            }
            newnode.setNext(front);
            front = newnode ;
        }
        else {
            Node temp = front ;
            while ( temp.getNext() != null && temp.getNext().getRoll_No() < newnode.getRoll_No() ){
                temp = temp.getNext();
            }
            newnode.setNext(temp.getNext());
            temp.setNext(newnode);
        }
    }

    public void dequeue (){
        if ( front == null ){
            System.out.println("Underflow... ");
        }
        else {
            front = front.getNext() ;
            System.out.println("Your updated list is : ");
            display() ;
        }
    }


    public void display (){
        Node temp = front;
        while ( temp != null ){
            System.out.println(temp.getRoll_No() + ". " + temp.getName());
            temp = temp.getNext();
        }
    }
}