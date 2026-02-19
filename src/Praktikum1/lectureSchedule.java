package Praktikum1;

import java.util.Scanner;

public class lectureSchedule {
    static int size;
    static String[][] schedule;
    static int course = 0;
    static Scanner sc = new Scanner(System.in);

    public static void addSchedule(){

        System.out.print("Course name: ");
        String name = sc.nextLine();

        System.out.print("Classroom used: ");
        String classroom = sc.nextLine();

        System.out.print("Day of the course: ");
        String day = sc.nextLine();

        System.out.print("Time: ");
        String time = sc.nextLine();

        schedule[course][0] = name;
        schedule[course][1] = classroom;
        schedule[course][2] = day;
        schedule[course][3] = time;

        course++;
        System.out.println("Course is added");
    }
    public static void displayAll() {

        System.out.println("\n========================================");
        System.out.println("          Full Lecture Schedule");
        System.out.println("========================================");

        if(course == 0){
            System.out.println("No Schedule Data");
            return;
        }
        System.out.printf("%-25s %-20s %-12s %-10s\n", "Course", "Classroom", "Day", "Time");
        System.out.println("----------------------------------------");

        for(int i = 0; i < course; i++){
            System.out.printf("%-25s %-20s %-12s %-10s\n",
                    schedule[i][0], schedule[i][1], schedule[i][2], schedule[i][3]);
        }
        System.out.println("========================================");
    }
    public static void searchByDay(){
        System.out.print("Enter day to search: ");
        String search = sc.nextLine();

        System.out.println("\n========================================");
        System.out.println("   Schedule on " + search);
        System.out.println("========================================");
        System.out.printf("%-25s %-20s %-10s%n", "Course", "Classroom", "Time");
        System.out.println("----------------------------------------");

        boolean found = false;

        for (int i = 0; i < course; i++){
            if(schedule[i][2].equalsIgnoreCase(search)){
                System.out.printf("%-25s %-20s %-10s\n",
                        schedule[i][0], schedule[i][1], schedule[i][3]);
                found = true;
            }
        }
        if(!found){
            System.out.println("There is no schedule at " + search);
        }
    }
    public static void searchByCourse() {
        System.out.print("Enter course name to search: ");
        String name = sc.nextLine();

        System.out.println("\n========================================");
        System.out.println("   Schedule for: " + name);
        System.out.println("========================================");
        System.out.printf("%-20s %-12s %-10s%n", "Classroom", "Day", "Time");
        System.out.println("----------------------------------------");

        boolean found = false;
        for (int i = 0; i < course; i++) {
            if (schedule[i][0].equalsIgnoreCase(name)) {
                System.out.printf("%-20s %-12s %-10s%n",
                        schedule[i][1], schedule[i][2], schedule[i][3]);
                found = true;
            }
        }

        if (!found) System.out.println("No schedule found for " + name);
        System.out.println("========================================\n");
    }
    public static void printMenu(){
        System.out.println("======= MENU =======");
        System.out.println("1. Add Schedule");
        System.out.println("2. Display All");
        System.out.println("3. Search by Day");
        System.out.println("4. Search by Course");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        int choice;
        System.out.print("Enter number of schedule: ");
        size = Integer.parseInt(sc.nextLine());
        schedule = new String[size][4];

        do{
            printMenu();
            System.out.print("Choose menu (1-5): ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    if (course >= size) {
                        System.out.println("Schedule is full!\n");
                    } else {
                        addSchedule();
                    }
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    searchByDay();
                    break;
                case 4:
                    searchByCourse();
                    break;
                case 5:
                    System.out.print("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println();

        }while (choice != 5);
    }
}
