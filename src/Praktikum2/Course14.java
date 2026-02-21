package Praktikum2;

public class Course14 {

    String courseCode;
    String name;
    int credits;
    int numberOfHours;

    public Course14() {

    }

    public Course14(String code, String nm, int cred, int hours) {
        courseCode = code;
        name = nm;
        credits = cred;
        numberOfHours = hours;
    }

    void showInformation(){
        System.out.println("Course code: " + courseCode);
        System.out.println("Course name: " + name);
        System.out.println("Course credits: " + credits);
        System.out.println("Number of course hours: " + numberOfHours);
    }

    void changeSKS(int newSKS){
        credits = newSKS;
        System.out.println("Credits is now: " + credits);
    }

    void addHours(int hours){
        numberOfHours = hours;
    }

    void reduceHours(int hours){
        if (numberOfHours < hours){
            System.out.println("Reduction cannot be made");
        }
        else{
            numberOfHours -= hours;
            System.out.println("Course hours is reduced to " + numberOfHours);
        }
    }
}
