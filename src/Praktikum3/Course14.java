package Praktikum3;

public class Course14 {
    public String code;
    public String name;
    public int sks;
    public int hour;

    public Course14(String code, String name, int sks, int hour){
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.hour = hour;
    }

    public void addData(String code, String name, int sks, int hour) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.hour = hour;
    }

    public void printInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Sks: " + sks);
        System.out.println("Hour: " + hour);
    }

}
