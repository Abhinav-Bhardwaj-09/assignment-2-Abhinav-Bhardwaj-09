package problem1.main;
import problem1.mybst.MyBinarySearchTree;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        boolean P = true;
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree obj = new MyBinarySearchTree();
        while (P) {
            System.out.println(" Press 1  :  To insert new node in tree.  ");
            System.out.println(" Press 2  :  To view all the left child nodes in In Order View.  ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.print("Enter the integer to you want to insert in the tree :  ");
                obj.insert(sc.nextInt());
            } else if (input == 2) {
                obj.InOrderView();
                P = false;
            }
            else {
                System.out.println("Enter a valid input.");
            }
        }

    }
}