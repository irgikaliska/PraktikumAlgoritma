package Praktikum3;

import java.util.Scanner;

public class courseDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of array: ");
        int n = Integer.parseInt(sc.nextLine());
        Course14[] arrayOfMatakuliah = new Course14[n];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode: ");
            kode = sc.nextLine();

            System.out.print("Nama: ");
            nama = sc.nextLine();

            System.out.print("Sks: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            System.out.println("------------------------------");

            arrayOfMatakuliah[i] = new Course14(kode, nama, sks, jumlahJam);
        }
        for(int i = 0; i < 3; i++){
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].code);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].name);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].hour);
            System.out.println("------------------------------");
        }
    }
}
