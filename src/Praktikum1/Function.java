package Praktikum1;

public class Function {
    static int[][] flowerStocks =
            {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};

    static int[] price = {75000, 50000, 60000, 10000};
    static String[] branch = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "Royal Garden 4"};

    public static int displayIncome(int store) {
        int total = 0;

        for(int j = 0; j < branch.length; j++){
            total += flowerStocks[store][j] * price[j];
        }
        return total;


    }
    public static String status(int income){
        if (income > 1500000){
            return "Very good";
        }
        else{
            return "Need Evaluation";
        }
    }

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("         RoyalGarden Report            ");
        System.out.println("========================================");
        System.out.printf("%-20s %-20s %-15s\n", "Branch", "Income", "Status");
        System.out.println("----------------------------------------");

        for(int i = 0; i < branch.length; i++){
            int income = displayIncome(i);
            String status = status(income);

            System.out.printf("%-20s %-20s %-15s%n",branch[i], String.format("%,d", income), status);

        }
        System.out.println("========================================");
    }
}
