package DSAVisualizerCLI.Algorithem.Searching;
import DSAVisualizerCLI.utils.Visualizer;

public class Bineary_search_itrative {

    public static int searchbineary(int[] arr,int target) {
        int low = 0;
        int high = arr.length -1;

        while (low<high) {
            int mid = low + (high - low) / 2;

            Visualizer.printArray(arr,mid,mid+1);

            if (arr[mid] == target) {
                System.out.println("the targeted value is present in the array");
                return mid;
            } else if (arr[mid] < target) {
                low =  low + 1;
            }
            else {
                high = high - 1;
            }
        }
        return -1;
    }
}
