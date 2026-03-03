package Praktikum3;

import Praktikum2.Mahasiswa14;

import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student14[] arrayOfStudent = new Student14[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfStudent[i] = new Student14();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            arrayOfStudent[i].nim = sc.nextLine();

            System.out.print("Nama: ");
            arrayOfStudent[i].nama = sc.nextLine();

            System.out.print("Kelas: ");
            arrayOfStudent[i].kelas = sc.nextLine();

            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayOfStudent[i].ipk = Float.parseFloat(dummy);

            System.out.println("------------------------------");
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM: " + arrayOfStudent[i].nim);
            System.out.println("Nama: " + arrayOfStudent[i].nama);
            System.out.println("Kelas: " + arrayOfStudent[i].kelas);
            System.out.println("IPK: " + arrayOfStudent[i].ipk);
            System.out.println("----------------------------------");
        }


//        arrayOfStudent[0] = new Student14();
//        arrayOfStudent[0].nim = "244107060033";
//        arrayOfStudent[0].nama = "AGNES TITANIA KINANTI";
//        arrayOfStudent[0].kelas = "SIB-1E";
//        arrayOfStudent[0].ipk = 3.75f;
//
//        arrayOfStudent[1] = new Student14();
//        arrayOfStudent[1].nim = "2341720172";
//        arrayOfStudent[1].nama = "ACHMAD MAULANA HAMZAH";
//        arrayOfStudent[1].kelas = "TI-2A";
//        arrayOfStudent[1].ipk = 3.36f;
//
//        arrayOfStudent[2] = new Student14();
//        arrayOfStudent[2].nim = "244107023006";
//        arrayOfStudent[2].nama = "DHIRMAWAN PUTRANTO";
//        arrayOfStudent[2].kelas = "TI-2E";
//        arrayOfStudent[2].ipk = 3.80f;
//
//        System.out.println("NIM     : " + arrayOfStudent[0].nim);
//        System.out.println("Nama    : " + arrayOfStudent[0].nama);
//        System.out.println("Kelas   : " + arrayOfStudent[0].kelas);
//        System.out.println("IPK     : " + arrayOfStudent[0].ipk);
//        System.out.println("----------------------------------");
//        System.out.println("NIM     : " + arrayOfStudent[1].nim);
//        System.out.println("Nama    : " + arrayOfStudent[1].nama);
//        System.out.println("Kelas   : " + arrayOfStudent[1].kelas);
//        System.out.println("IPK     : " + arrayOfStudent[1].ipk);
//        System.out.println("----------------------------------");
//        System.out.println("NIM     : " + arrayOfStudent[2].nim);
//        System.out.println("Nama    : " + arrayOfStudent[2].nama);
//        System.out.println("Kelas   : " + arrayOfStudent[2].kelas);
//        System.out.println("IPK     : " + arrayOfStudent[2].ipk);
//        System.out.println("----------------------------------");

    }
}
