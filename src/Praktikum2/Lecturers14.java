package Praktikum2;

public class Lecturers14 {

    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecturers14(){

    }

    public Lecturers14(String id, String nm, boolean status, int entryYear, String expertise){
        idLecturer = id;
        name = nm;
        activeStatus = status;
        yearOfEntry = entryYear;
        expertiseCompetency = expertise;
    }

    void displayInformation(){
        System.out.println("Lecturer id: " + idLecturer);
        System.out.println("Lecturer name: " + name);
        System.out.println("Lecturer status: " + (activeStatus ? "Active" : "Inactive"));
        System.out.println("Lecturer year of entry: " + yearOfEntry);
        System.out.println("Lecturer expertise competency: " + expertiseCompetency);
    }

    void setActiveStatus(boolean status){
        activeStatus = status;
    }

    int calculateTimeWork(int yearNow){
        int yearsWorked = yearNow - yearOfEntry;
        System.out.println("This lecturer has worked for " + yearsWorked + " years");
        return yearsWorked;
    }

    void changeSkill(String skill){
        expertiseCompetency = skill;
    }
}
