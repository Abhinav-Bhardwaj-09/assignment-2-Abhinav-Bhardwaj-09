package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.Node.QueueNode;

public class MyQueue {
    QueueNode front;
    QueueNode rear;

    public MyQueue () {
        this.front = null;
        this.rear = null;
    }

    public void enqueue ( int value) {
        QueueNode newnode = new QueueNode(value);
        if ( front == null && rear == null ){
            front = newnode;
            rear = newnode;
            return;
        }
        else {
            QueueNode current = front;
            while ( current.getElement() != rear.getElement() ){
                current = current.getNext();
            }
            rear.setNext(newnode);
            rear = newnode;
        }
    }



    public void QueueDisplay () {
        QueueNode current = front;
        System.out.println();
        System.out.print(" The queue of pre - order successor of all the nodes of BST that you have entered : " + current.getElement() + " - ");
        current = current.getNext();
        while ( current != null ){
            System.out.print( current.getElement() + " " );
            current = current.getNext();
        }
        System.out.println("Does not exist.");
           front = rear = null;
    }
}