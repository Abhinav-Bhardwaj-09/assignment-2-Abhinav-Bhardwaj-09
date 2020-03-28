package problem3.main;
import problem3.myqueue.*;
import problem3.node.Node;
import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student


//Student can be of different class therefore roll no can be same.


public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPriorityQueue mpq = new MyPriorityQueue();
        boolean Flag = true ;
        int input , Roll;
        String FullName;
        while ( Flag ){
            System.out.println("  Press  1  :  To insert data of new Student.  ");
            System.out.println("  Press  2  :  To delete the Student having smallest Roll no. ");
            System.out.println("  Press  3  :  To view the complete lst of students along with their Roll no. ");
            System.out.println("  Press  4  :  To quit program. ");
            input = sc.nextInt();
            if ( input == 1 ){
                System.out.print("Enter the Roll number ( only in integer )  :  ");
                Roll = sc.nextInt();
                if (Roll <= 0 ){
                    System.out.print("Enter a valid Roll Number ( > 0) : ");
                    Roll = sc.nextInt();
                }
                System.out.print("Enter the full name with ( _ ) in place of space  :  ");
                FullName = sc.next();
                Node Newnode = new Node (Roll,FullName);
                mpq.enqueue(Newnode);
                System.out.println();
            }
            else if( input == 2 ){
                mpq.dequeue();
            }
            else if(input == 3 ){
                mpq.display();
            }
            else if( input == 4 ){
                Flag = false;
                System.out.println("Your program has been stopped successfully.  ");
            }
            else {
                System.out.println("Enter a valid input.");
            }
        }
    }
}