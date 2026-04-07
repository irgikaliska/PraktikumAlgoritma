package Week6;

public class sortingMain {
    public static void main(String[] args) {

        int[] a = {34, 7, 23, 32, 5, 62};

        Sorting14 sorting = new Sorting14(a);

        System.out.println("Original array");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort): ");
        sorting.print();

        int[] b = {30, 20, 2, 8, 14};

        Sorting14 sorting2 = new Sorting14(b);

        System.out.println("Original array");
        sorting2.print();
        sorting2.bubbleSort();
        System.out.println("Sorted array (Selection Sort): ");
        sorting2.print();

        int[] c = {40, 10, 4, 9, 3};

        Sorting14 sorting3 = new Sorting14(c);

        System.out.println("Original array");
        sorting3.print();
        sorting3.bubbleSort();
        System.out.println("Sorted array (Insertion Sort): ");
        sorting3.print();
    }
}
