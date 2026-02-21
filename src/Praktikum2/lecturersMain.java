package Praktikum2;

public class lecturersMain {
    public static void main(String[] args) {

        Lecturers14 lecturer1 = new Lecturers14();
        lecturer1.idLecturer = "A113";
        lecturer1.name = "Sheldon Cooper";
        lecturer1.activeStatus = true;
        lecturer1.yearOfEntry = 2007;
        lecturer1.expertiseCompetency = "Experimental Physicist";

        lecturer1.displayInformation();
        System.out.println();
        lecturer1.setActiveStatus(false);
        lecturer1.calculateTimeWork(2026);
        lecturer1.changeSkill("Theoretical Physicist");
        System.out.println();
        lecturer1.displayInformation();


        System.out.println();
        System.out.println("===============================");
        System.out.println();

        Lecturers14 lecturer2 = new Lecturers14("A112", "Leonard Hofstadter", true, 2007, "Theoretical Physicist");
        lecturer2.displayInformation();
        System.out.println();
        lecturer2.setActiveStatus(false);
        lecturer2.calculateTimeWork(2026);
        lecturer2.changeSkill("Experimental Physicist");
        System.out.println();
        lecturer2.displayInformation();

    }
}
