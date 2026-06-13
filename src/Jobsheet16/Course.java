package Jobsheet16;

public class Course {
    String code;
    String name;
    int credits;

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return code + " - " + name + " (" + credits + " credits)";
    }
}