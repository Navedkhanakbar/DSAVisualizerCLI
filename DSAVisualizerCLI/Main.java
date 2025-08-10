package DSAVisualizerCLI;
import java.util.Scanner;
import DSAVisualizerCLI.Algorithem.sorting.bubble_sort;
import DSAVisualizerCLI.Algorithem.Searching.linear_search;
import DSAVisualizerCLI.Algorithem.Searching.Bineary_search_itrative;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = true;

        do {


            System.out.println("=== DSA Visualizer ===");
            System.out.println("***Searching algorithm***");
            System.out.println("1. linear search");
//            System.out.println();
            System.out.println("***Sorting algorithm***");
            System.out.println("2. bubble sort");
//            System.out.println();
            System.out.print("3. Binary sort iterative ");
            System.out.println("(If you are using Binary search enter sorted elements)");
            System.out.println("0.EXIT");
            System.out.println("Choose the algorithm by given numbers: ");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) {
                System.out.println("Exiting.....");
                return;
            }
            System.out.println("\nEnter Array elements (comma separated): ");
            String input = sc.nextLine();

            String[] part = input.split(",");
            int[] arr = new int[part.length];


            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(part[i].trim());
            }

            switch (choice) {


                case 2 -> {
                    System.out.println("\nStarting the bubble sort visualization");
                    bubble_sort.sort(arr);
                }
                case 1 -> {
                    System.out.println("value you want to search: ");
                    int value = Integer.parseInt(sc.nextLine());
                    System.out.println("\nStarting the linear search visualization");
                    linear_search.searchlinear(arr,value);
                }
                case 3-> {
                    System.out.println("Enter the target value you want to search: ");
                    int value = Integer.parseInt(sc.nextLine());
                    System.out.println("\nStarting the Binary search");
                    Bineary_search_itrative.searchbineary(arr,value);
                }
            }



        }while (true);




    }
}
