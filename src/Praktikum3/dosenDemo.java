package Praktikum3;

import java.util.Scanner;

public class dosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many lecturers: ");
        int n = Integer.parseInt(sc.nextLine());

        Dosen14[] dosenArray = new Dosen14[n];

        for(int i = 0; i < dosenArray.length; i++){
            System.out.println("Enter data for Lecturer " + (i + 1) + ":");

            System.out.print("  Code   : ");
            String code = sc.nextLine();

            System.out.print("  Name   : ");
            String name = sc.nextLine();

            System.out.print("  Gender (M/F) : ");
            String genderInput = sc.nextLine().trim().toUpperCase();
            boolean gender = genderInput.equals("M");

            System.out.print("  Age    : ");
            int age = Integer.parseInt(sc.nextLine());

            dosenArray[i] = new Dosen14(code, name, gender, age);
        }

//        int count = 1;
//        for (Dosen14 lect:dosenArray){
//            System.out.println("Lecturer " + count + ":");
//            System.out.println("  Code   : " + lect.code);
//            System.out.println("  Name   : " + lect.name);
//            System.out.println("  Gender : " + lect.getGenderString());
//            System.out.println("  Age    : " + lect.age);
//            count++;
//        }

        dataDosen.dataAllDosen(dosenArray);
        dataDosen.averageAgeOfLecturersPerGender(dosenArray);
        dataDosen.numberOfLecturesPerGender(dosenArray);
        dataDosen.oldestLecturer(dosenArray);
        dataDosen.youngestLecturer(dosenArray);
    }
}
