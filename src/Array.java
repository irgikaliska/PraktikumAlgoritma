import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 3, 1, 1};

        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];

        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

        System.out.println("====================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s %-15s %-15s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilaiXSks = 0;
        int totalSks = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-10.2f%n",
                    mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);

            totalNilaiXSks += nilaiSetara[i] * sks[i];  // Nilai Setara * SKS
            totalSks += sks[i];
        }

        double ip = totalNilaiXSks / totalSks;

        System.out.println("====================");
        System.out.printf("IP : %.2f%n", ip);
        System.out.println("====================");

    }
}
