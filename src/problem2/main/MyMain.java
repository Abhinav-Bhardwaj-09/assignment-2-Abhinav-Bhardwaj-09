package problem2.main;
import problem1.mybst.MyBinarySearchTree;
import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        boolean F = true;
        boolean T = true;
        int option;
        System.out.print("Enter the root node of Binary Search Tree :  ");
        int element = sc.nextInt();
        bst.insert(element);
        while ( F ){
            System.out.print("Enter the next element : ");
            element = sc.nextInt();
            bst.insert(element);
            System.out.println("Do you want to insert more nodes : ");
            System.out.println("Press 1 : Yes ");
            System.out.println("Press 2 : No ");
            option = sc.nextInt();
            if( option == 2 ){
                F = false;
            }
            else if ( option != 1 && option != 2 ) {
                System.out.println("Enter a valid input.");
            }
        }
        while ( T ){
            System.out.println("Which one you want to verify ?");
            System.out.println("   Press 1 : Root element is placed at opposite end, i.e. in pre order root is the first element where as in post order root is the last element. ");
            System.out.println("   Press 2 : They have common mid point, i.e. both the traversal will give same element at the mid position for odd number of nodes. ");
            option = sc.nextInt();
            if ( option == 1 || option == 2 ) {
                bst.display(option);
                System.out.println();
                System.out.println();
                System.out.println("Do you want to Exit or Continue ?");
                System.out.println("Press 1 : To Exit ");
                System.out.println("Press 2 : To Continue ");
                element = sc.nextInt();
                if ( element == 1 )
                    T = false;
            }
            else
                System.out.println("Enter a valid input.");
        }
    }
}