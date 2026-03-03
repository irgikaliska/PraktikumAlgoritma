package Praktikum3;

public class dataDosen {

    static void dataAllDosen(Dosen14[] arrayDosen){

        int count = 1;
        for (Dosen14 lect : arrayDosen){
            System.out.println("Lecturer " + count + ":");
            System.out.println("  Code   : " + lect.code);
            System.out.println("  Name   : " + lect.name);
            System.out.println("  Gender : " + lect.getGenderString());
            System.out.println("  Age    : " + lect.age);
            count++;
        }
    }

    static void numberOfLecturesPerGender(Dosen14[] arrayDosen){
        int male = 0;
        int female = 0;
        for (Dosen14 lect : arrayDosen){
            if (lect.gender) {
                male++;
            }
            else {
                female++;
            }
        }
        System.out.println("The number of male lecturer is: " + male);
        System.out.println("The number of female lecturer is: " + female);
    }
    static void averageAgeOfLecturersPerGender(Dosen14[] arrayDosen){
        int totalMaleAge = 0;
        int totalFemaleAge = 0;
        int femaleCount = 0;
        int maleCount = 0;

        for (Dosen14 lect : arrayDosen){
            if(lect.gender){
                totalMaleAge += lect.age;
                maleCount++;
            }
            else{
                totalFemaleAge += lect.age;
                femaleCount++;
            }
        }
        System.out.printf("Male Lecturers Average Age : %.2f%n", (double) totalMaleAge / maleCount);
        System.out.printf("Female Lecturers Average Age : %.2f%n", (double) totalFemaleAge / femaleCount);

    }
    static void oldestLecturer(Dosen14[] arrayDosen){
        Dosen14 oldest = arrayDosen[0];
        for (Dosen14 lect : arrayDosen) {
            if(lect.age > oldest.age){
                oldest = lect;
            }
        }
        System.out.println("  Code   : " + oldest.code);
        System.out.println("  Name   : " + oldest.name);
        System.out.println("  Gender : " + oldest.getGenderString());
        System.out.println("  Age    : " + oldest.age);
    }
    static void youngestLecturer(Dosen14[] arrayDosen) {
        Dosen14 youngest = arrayDosen[0];
        for (Dosen14 lect : arrayDosen) {
            if (lect.age > youngest.age) {
                youngest = lect;
            }
        }
        System.out.println("  Code   : " + youngest.code);
        System.out.println("  Name   : " + youngest.name);
        System.out.println("  Gender : " + youngest.getGenderString());
        System.out.println("  Age    : " + youngest.age);
    }
}
