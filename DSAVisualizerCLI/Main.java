package DSAVisualizerCLI;
import java.util.Scanner;
import DSAVisualizerCLI.Algorithem.sorting.bubble_sort;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("=== DSA Visualizer ===");
        System.out.print("Enter Array elements (comma separated): ");
        String input = sc.nextLine();

        String[] part = input.split(",");
        int[] arr = new int[part.length];


        for (int i = 0;i< arr.length;i++) {
            arr[i] = Integer.parseInt(part[i].trim());
        }

        System.out.println("\nStarting the bubble sort visualization");
        bubble_sort.sort(arr);




    }
}
