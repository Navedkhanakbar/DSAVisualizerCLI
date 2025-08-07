package DSAVisualizerCLI.Algorithem.sorting;
import DSAVisualizerCLI.utils.Visualizer;

public class bubble_sort {
    public static void sort(int[] arr) {
        int n = arr.length;

        System.out.println("Array before sorting: ");
        Visualizer.printArray(arr);


        for (int i = 0;i < n - 1;i++) {
            System.out.println("\npass" + (i + 1) + ": ");
            boolean swapped = false;


            for (int j = 0; j < n -i - 1; j++) {
                Visualizer.printArray(arr, j, j + 1); // highlighting the comparing indices

                if (arr[j] > arr[j + 1]) {
                    // swap arr[i] and arr[i+i] (i = j) here.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // breaking if array is already sorted.
        }

        System.out.println("\nsorted arrary : ");
        Visualizer.printArray(arr); //final result of sorted array.

    }
}
