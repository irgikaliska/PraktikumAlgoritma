package Praktikum1;

import java.util.Scanner;

public class lisencePlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] codes = {'A','B','C','D','F','G','H','L','N','T'};
        char[][] city = {
                {'B', 'A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B','A','N','D','U','N','G'},
                {'C','I','R','E','B','O','N'},
                {'B','O','G','O','R'},
                {'P','E','K','A','L','O','N','G','A','N'},
                {'S','E','M','A','R','A','N','G'},
                {'S','U','R','A','B','A','Y','A'},
                {'M','A','L','A','N','G'},
                {'T','E','G','A','L'}
            };

        System.out.print("Input licence plate code: ");
        char code = sc.next().toUpperCase().charAt(0);

        boolean found = false;

        for(int i = 0; i < codes.length; i++){
            if(codes[i] == code){
                System.out.println("City Name:");
                for(int j = 0; j < city[i].length; j++){
                    System.out.print(city[i][j]);
                }
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Code not valid");
        }
    }
}
