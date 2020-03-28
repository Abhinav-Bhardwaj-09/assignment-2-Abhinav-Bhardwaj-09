package problem5.student;
// to store student information and properties
public class Student {
    private String Name;
    private int Roll;
    private int No_of_Backlogs;
    private int AppearingCount;

    public Student(String name, int roll, int no_of_Backlogs, int appearingCount) {
        Name = name;
        Roll = roll;
        No_of_Backlogs = no_of_Backlogs;
        AppearingCount = appearingCount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public int getNo_of_Backlogs() {
        return No_of_Backlogs;
    }

    public void setNo_of_Backlogs(int no_of_Backlogs) {
        No_of_Backlogs = no_of_Backlogs;
    }

    public int getAppearingCount() {
        return AppearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        AppearingCount = appearingCount;
    }
}