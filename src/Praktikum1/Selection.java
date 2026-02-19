package Praktikum1;

import java.util.Scanner;

public class Selection {
    static int nilaiTugas;
    static int nilaiKuis;
    static int nilaiUTS;
    static int nilaiUAS;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextInt();

        System.out.print("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextInt();

        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();

        System.out.println("======================");
        System.out.println("======================");

        if(nilaiKuis > 100|| nilaiUTS > 100 || nilaiTugas > 100 || nilaiUAS > 100){
            System.out.println("Nilai Tidak Valid");
            System.out.println("======================");
            System.out.println("======================");
        }else{
            double nilaiAkhir = (double) (nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS) / 4;
            String nilaiHuruf;
            boolean lulus = true;
            System.out.println("Nilai Akhir = " + nilaiAkhir);

            if(nilaiAkhir > 80 && nilaiAkhir <= 100){
                nilaiHuruf = "A";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("======================");
                System.out.println("======================");
            }
            else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
                nilaiHuruf = "B+";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("======================");
                System.out.println("======================");
            }
            else if(nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("======================");
                System.out.println("======================");
            }
            else if(nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("======================");
                System.out.println("======================");
            }
            else if(nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("======================");
                System.out.println("======================");
            }
            else if(nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                lulus = false;
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("======================");
                System.out.println("======================");
            }
            else if(nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                lulus = false;
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("======================");
                System.out.println("======================");
            }

            if(!lulus) {
                System.out.println("MAAF ANDA TIDAK LULUS");
            }
            else{
                System.out.println("SELAMAT ANDA LULUS");
            }

        }
    }
}
