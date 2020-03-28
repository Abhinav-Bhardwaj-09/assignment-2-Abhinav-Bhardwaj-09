package problem1.mybst;
import problem1.node.*;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

public class MyBinarySearchTree {
    TreeNode root ;
    int total , m , Mid_Pre , Mid_Post ,  NotPresent = 0;
    MyQueue obj = new MyQueue();

    public MyBinarySearchTree() {
        root = null;
    }

    public void insert( int val ) {
        TreeNode n1 = new TreeNode(val);
        if (root == null) {
            root = n1 ;
            total = total + 1 ;
            return;
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            while ( true ) {
                parent = current;
                if (val <= current.getData()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(n1);
                        total = total + 1 ;
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(n1);
                        total = total + 1 ;
                        return;
                    }
                }
            }
        }
    }





    // Problem - 4
    public void PreOrderView (){
        preOrderDisplay( root );
        obj.QueueDisplay();
    }
    public void preOrderDisplay ( TreeNode  N ) {
        if ( N == null ) {
            return;
        }else {
            obj.enqueue( N.getData() );
            preOrderDisplay( N.getLeft() );
            preOrderDisplay( N.getRight() );
        }
    }



    // Problem - 1
    public void InOrderView (){
        printInorder( root );
        System.out.println();
        System.out.println( NotPresent );
    }
    public void printInorder( TreeNode node ) {
        if ( node == null )
            return;
        if( node.getLeft() == null ){
            NotPresent = NotPresent + 1 ;
        }
        else {
            System.out.println(node.getLeft().getData());
        }
        printInorder(node.getLeft());
        printInorder(node.getRight());
    }








    //Problem - 2
    TreeNode First_of_Preorder , Last_of_Postorder = null ;
    public void display ( int n ){
        System.out.println();
        System.out.println();
        System.out.print("Post - Order View : ");
        m = 0 ;
        PostOrder_Display( root );
        System.out.println();
        System.out.println();
        System.out.print("Pre - Order View : ");
        m = 0 ;
        PreOrder_Display( root );
        System.out.println();
        if ( n == 1 ){
            System.out.println();
            System.out.println();
            System.out.println("Last element in Post - Order View : " + Last_of_Postorder.getData() );
            System.out.println("First element in Pre - Order View : " + First_of_Preorder.getData() );
            System.out.println();
            if ( First_of_Preorder == Last_of_Postorder ){
                System.out.println("Since , both are same therefore statement is true and it is verified.");
            }
            else{
                System.out.println("Statement is false.");
            }
        }
        else if ( n == 2 ){
            if ( total % 2 != 0 ) {
                System.out.println("Mid point of Post - Order View : " + Mid_Post );
                System.out.println("Mid point of Pre - Order View : " + Mid_Pre );
                if ( Mid_Post != Mid_Pre ){
                    System.out.println("Since , both are different therefore statement is false.");
                }
                else {
                    System.out.println("Statement is true.");
                }
            }
            else
                System.out.println("Since, there are even no. of nodes in the tree therefore there can't be any mid point.");
        }
        else {
            System.out.println("Enter the valid input.");
        }
    }
    public void PostOrder_Display ( TreeNode NewNode ){
        if (NewNode == null )
            return ;
        else {
            m = m + 1 ;
            PostOrder_Display( NewNode.getLeft() );
            PostOrder_Display( NewNode.getRight() );
            System.out.print( NewNode.getData() + " " );
            if (      ( m == ( ( ( total - 1 ) / 2 ) + 1 ) )    &&    ( total % 2 != 0 )       ){
                Mid_Post = NewNode.getData();
            }
            Last_of_Postorder = NewNode;
        }
    }
    public void PreOrder_Display ( TreeNode NewNode ){
        if (NewNode == null)
            return;
        else {
            m = m + 1 ;
            System.out.print( NewNode.getData() + " " );
            if ( m == 1 ){
                First_of_Preorder = NewNode;
            }
            if ( m == ( ( ( total - 1 ) / 2 ) + 1 ) ){
                Mid_Pre = NewNode.getData();
            }
            PreOrder_Display( NewNode.getLeft() );
            PreOrder_Display( NewNode.getRight() );
        }
    }
}