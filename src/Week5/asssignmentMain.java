package Week5;

import Praktikum3.Dosen14;

import java.util.Scanner;

public class asssignmentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students: ");
        int n = Integer.parseInt(sc.nextLine());

        Assignment[] studentArr = new Assignment[n];

        for(int i = 0; i < studentArr.length; i++){
            System.out.println("Enter students score " + (i + 1) + ":");

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("ID : ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Year : ");
            int year = Integer.parseInt(sc.nextLine());

            System.out.print("Mid Score : ");
            int midScore = Integer.parseInt(sc.nextLine());

            System.out.print("Final Score : ");
            int finalScore = Integer.parseInt(sc.nextLine());

            studentArr[i] = new Assignment(name, id, year, midScore, finalScore);
        }

        System.out.println("Highest Midterm Score : " + studentArr[0].findHighestDC(studentArr, 0, n-1));
        System.out.println("Lowest Midterm Score : " + studentArr[0].findLowestDC(studentArr, 0, n-1));
        System.out.println("Average Final Score : " + studentArr[0].averageFinalScore(studentArr));
    }


}
