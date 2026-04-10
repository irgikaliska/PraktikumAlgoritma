package Week7;

public class sortMain {
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};

        mergeSort ms = new mergeSort();

        System.out.println("Sorting with merge sort");
        System.out.print("Initial Data\n");
        for (int num : data) {
            System.out.print(num + " ");
        }

        ms.mergeSort(data);

        System.out.print("\nSorted Data\n");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}

