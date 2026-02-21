package Praktikum2;

public class courseMain {
    public static void main(String[] args) {

        Course14 course1 = new Course14();
        course1.courseCode = "A113";
        course1.name = "English";
        course1.credits = 3;
        course1.numberOfHours = 5;

        course1.showInformation();
        System.out.println();
        course1.addHours(5);
        course1.changeSKS(2);
        course1.reduceHours(1);
        System.out.println();
        course1.showInformation();


        Course14 course2 = new Course14("A112", "Basic Programming", 3, 6);

        course2.showInformation();
        System.out.println();
        course2.addHours(10);
        course2.changeSKS(3);
        course2.reduceHours(2);
        System.out.println();
        course2.showInformation();

    }
}
