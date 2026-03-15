package Week5;

import java.util.Scanner;

public class sumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input element number: ");
        int element = sc.nextInt();

        Sum sm = new Sum(element);

        for (int i = 0; i < element ; i++){
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.profits[i] = sc.nextDouble();
        }
        System.out.println("Profit total using BF: " + sm.totalBF());
        System.out.println("Profit total using DC: " + sm.totalDC(sm.profits, 0, element-1));
    }
}
