package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.mybst.*;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        Scanner sc = new Scanner(System.in);
        boolean Flag = true;
        int input , element , option ;
        while ( Flag ){
            System.out.println("Press 1 : To insert new node in BST . ");
            System.out.println("Press 2 : To view the queue. ");
            input = sc.nextInt();
            if ( input == 1 ){
                System.out.print("Enter the integer you want to insert in the tree : ");
                element = sc.nextInt();
                mbst.insert(element);
            }
            else if ( input == 2 ){
                mbst.PreOrderView();
                System.out.println("Press 1 : To insert more nodes in the tree. ");
                System.out.println("Press 2 : To exit. ");
                option = sc.nextInt();
                if(option == 2 ){
                    Flag = false;
                }
            }
            else {
                System.out.println("Enter a valid input.");
            }
        }
    }
}
