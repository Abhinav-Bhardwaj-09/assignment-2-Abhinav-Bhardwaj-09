package problem5.main;
import problem5.circularqueue.MyCircularQueue;
import java.util.Scanner;
//executable class


public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCircularQueue obj = new MyCircularQueue();
        int size , Flag , Roll , AppearingCount , Backlogs ;
        System.out.print("Enter the number of observations : ");
        size = sc.nextInt();
        System.out.println();
        for (int i = 0; i < size; i++) {
            Flag = 0;
            System.out.print("Enter the name of Student :  ");
            String Name = sc.nextLine();
            sc.next();
            System.out.print("Enter the Roll no.  :  ");
            Roll = sc.nextInt();
            System.out.println();
            System.out.print("Enter the no. of Backlogs : ");
            Backlogs = sc.nextInt();
            System.out.println();
            AppearingCount = 0;
            System.out.print(" Enter the no. of Appearing Count ( Appearing Count must be smaller or equal to number of backlogs and also must not be greater then 2 )  :  ");
            while (Flag != 1) {
                AppearingCount = sc.nextInt();
                System.out.println();
                if ( AppearingCount > Backlogs || AppearingCount > 2) {
                    System.out.print("You have entered wrong Appearing Count, Enter Again : ");
                }
                else {
                    Flag = 1;
                }
            }
            obj.insert(Name, Roll, Backlogs, AppearingCount);
        }
        obj.filtering();
        System.out.println();
        System.out.println("                  BEFORE PROCESSING                  " );
        System.out.println();
        obj.display();
        System.out.println();
        System.out.println();
        System.out.println("                  AFTER PROCESSING                    ");
        System.out.println();
        System.out.println();
        obj.processingByUsingIteration();
        obj.display();
    }
}