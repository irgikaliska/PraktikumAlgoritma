package caseMethod;

public class Student {
    String id;
    String name;
    String studyProgram;

    Student(String id, String name, String studyProgram){
        this.id = id;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public void showStudent(){
        System.out.println(id + " | " + name + " | " + studyProgram);
    }
}
