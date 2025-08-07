package DSAVisualizerCLI.Algorithem.Searching;
import DSAVisualizerCLI.utils.Visualizer;

public class linear_search {
    public static void searchlinear(int[] arr,int search_key_value) {

        System.out.println("\nArray preview");
        Visualizer.printArray(arr);


        for(int i = 0;i < arr.length;i++) {
            Visualizer.printArray(arr,i);
            if(arr[i] == search_key_value) {
                System.out.println("this array contains the key value we are searching for"+ arr[i]);
                break;
            }
        }
    }
}
