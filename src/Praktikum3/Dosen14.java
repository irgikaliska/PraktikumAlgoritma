package Praktikum3;

public class Dosen14 {
    String code;
    String name;
    boolean gender;
    int age;

    public Dosen14(String code, String name, boolean gender, int age){
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    String getGenderString() {
        return gender ? "Male" : "Female";
    }
}
